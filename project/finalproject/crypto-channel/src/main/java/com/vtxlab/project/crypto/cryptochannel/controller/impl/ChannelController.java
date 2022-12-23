package com.vtxlab.project.crypto.cryptochannel.controller.impl;

import com.vtxlab.project.crypto.cryptochannel.controller.ChannelOperation;
import com.vtxlab.project.crypto.cryptochannel.exception.ApiException;
import com.vtxlab.project.crypto.cryptochannel.model.dto.ChannelDto;
import com.vtxlab.project.crypto.cryptochannel.service.OrchestrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/crypto/channel/api/v1")
public class ChannelController implements ChannelOperation {

    @Autowired
    OrchestrationService orchestrationService;

    @Override
    public ChannelDto getAppExchangeRate(List<String> cryptos, List<String> currencies) throws ApiException {
        return orchestrationService.getExchangeRates(cryptos, currencies, "crypto-web");
    }

    @Override
    public ChannelDto getWebExchangeRate(List<String> cryptos, List<String> currencies) throws ApiException {
        return orchestrationService.getExchangeRates(cryptos, currencies, "crypto-app");
    }
}
