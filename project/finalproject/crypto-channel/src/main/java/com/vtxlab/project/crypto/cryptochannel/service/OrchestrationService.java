package com.vtxlab.project.crypto.cryptochannel.service;

import com.vtxlab.project.crypto.cryptochannel.exception.ApiException;
import com.vtxlab.project.crypto.cryptochannel.model.dto.ChannelDto;

import java.util.List;

public interface OrchestrationService {

    ChannelDto getExchangeRates(List<String> cryptos, List<String> currencies, String sourceApp) throws ApiException;

    ChannelDto getExchangeRates2(List<String> cryptos, List<String> currencies, String sourceApp) throws ApiException;
}
