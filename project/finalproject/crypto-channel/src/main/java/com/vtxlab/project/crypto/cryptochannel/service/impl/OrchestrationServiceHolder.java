package com.vtxlab.project.crypto.cryptochannel.service.impl;

import com.vtxlab.project.crypto.cryptochannel.exception.ApiException;
import com.vtxlab.project.crypto.cryptochannel.model.Channel;
import com.vtxlab.project.crypto.cryptochannel.model.ChannelCoinMapping;
import com.vtxlab.project.crypto.cryptochannel.model.ChannelTransaction;
import com.vtxlab.project.crypto.cryptochannel.model.dto.ChannelDto;
import com.vtxlab.project.crypto.cryptochannel.service.AdminService;
import com.vtxlab.project.crypto.cryptochannel.service.OrchestrationService;
import com.vtxlab.project.crypto.cryptochannel.service.ThirdPartyService;
import com.vtxlab.project.crypto.cryptochannel.service.ThirdPartyService2;
import com.vtxlab.project.crypto.cryptochannel.utils.ThirdPartyServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class OrchestrationServiceHolder implements OrchestrationService {

    @Autowired
    AdminService adminService;

    @Autowired
    ThirdPartyService thirdPartyService;

    @Autowired
    ThirdPartyServiceFactory thirdPartyServiceFactory;

    final static String TRAN_TYPE_EX_RATE = "ex-rate";

    // Approach 1
    @Override
    public ChannelDto getExchangeRates(List<String> cryptos, List<String> currencies, String sourceApp) throws ApiException {
        // Step 1: Invoke Admin Service
        Channel channel = adminService.getChannelBySourceAppAndTranType(sourceApp, TRAN_TYPE_EX_RATE);

        // Step 2: Prepare parameters for step 3
        Predicate<ChannelTransaction> sourceAppCheck = e -> sourceApp.equals(e.getSourceApp());
        Predicate<ChannelTransaction> tranTypeCheck = e -> TRAN_TYPE_EX_RATE.equals(e.getTranType());

        // Get Channel Transaction for URL mapping
        ChannelTransaction channelTran = channel.getChannelTrans()
                .stream().filter(sourceAppCheck.and(tranTypeCheck)).findFirst()
                .orElse(null);

        // Get Channel Coin Mapping for coin code conversion
        List<String> coinIds = channel.getCoinMaps().stream() //
                .map(ChannelCoinMapping::getCoinId).collect(Collectors.toList());

        // Step 3: Invoke Third Party API Service
        return thirdPartyService.getThirdPartyExchangeRates(
                coinIds, // [bitcoin, tether, ethereum]
                currencies,
                channel.getChannelUrl(),
                channelTran.getDomainVersion(),
                channelTran.getDomainUrl());
    }

    // Design Approach 2: Assume all third party API service mapping coded
    // in channel service
    @Override
    public ChannelDto getExchangeRates2(List<String> cryptos, List<String> currencies, String sourceApp) throws ApiException {

        ThirdPartyService2 thirdPartyService = thirdPartyServiceFactory
                .produceThirdPartyService(sourceApp);

        return thirdPartyService.getThirdPartyExchangeRates(cryptos, currencies);
    }
}
