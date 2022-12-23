package com.vtxlab.project.crypto.cryptochannel.service.impl;

import com.vtxlab.project.crypto.cryptochannel.exception.ApiException;
import com.vtxlab.project.crypto.cryptochannel.model.ChannelCoinMapping;
import com.vtxlab.project.crypto.cryptochannel.model.dto.ChannelDto;
import com.vtxlab.project.crypto.cryptochannel.service.AdminService;
import com.vtxlab.project.crypto.cryptochannel.service.ThirdPartyService2;
import com.vtxlab.project.crypto.cryptochannel.utils.ChannelApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Slf4j
// Approach 2
public class CoingeckoService implements ThirdPartyService2 {

    @Autowired
    AdminService adminService;

    @Autowired
    ChannelApi channelApi;

    final static String TRAN_TYPE_EX_RATE = "ex-rate";
    final static String CHANNEL_CODE_COINGECKO = "coingecko";

    @Value("${service.coingecko.baseUrl}")
    String baseUrl;
    @Value("${service.coingecko.serviceVers}")
    String serviceVers;
    @Value("${service.coingecko.serviceUrl}")
    String serviceUrl;

    @Override
    public ChannelDto getThirdPartyExchangeRates(List<String> cryptos,
                                                 List<String> currencies) throws ApiException {

        List<ChannelCoinMapping> coinMappings = adminService
                .getChannelByChannelCode(CHANNEL_CODE_COINGECKO).getCoinMaps();

        // cryptos = [BTC, USDT]
        // coinMappings = [{BTC, bitcoin}, {USDT, tether}, ... N objects]
        List<String> coins = cryptos.stream()
                .map(coin -> {
                    // line 52-54, find {BTC, bitcoin} by BTC, and return bitcoin
                    return coinMappings.stream()
                            .filter(m -> m.getCoinCode() == coin)
                            .map(e -> e.getCoinId()).toString();
                }).collect(Collectors.toList());

        log.info("coins={}", coins);
        String concatCoins = String.join(",", coins); // bitcoin, tether
        String concatCurrencies = String.join(",", currencies); // USD

        Map<String, String> hMap = new HashMap<>();
        hMap.put("coins", concatCoins);
        hMap.put("currency", concatCurrencies);

        return channelApi.invoke(baseUrl,
                serviceVers, serviceUrl,
                hMap, ChannelDto.class);

    }
}
