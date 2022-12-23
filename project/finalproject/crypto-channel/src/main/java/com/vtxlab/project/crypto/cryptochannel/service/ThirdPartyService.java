package com.vtxlab.project.crypto.cryptochannel.service;

import com.vtxlab.project.crypto.cryptochannel.exception.ApiException;
import com.vtxlab.project.crypto.cryptochannel.model.dto.ChannelDto;

import java.util.List;

public interface ThirdPartyService {

    ChannelDto getThirdPartyExchangeRates(List<String> cryptos, List<String> currencies, String baseUrl, String serviceVers, String serviceUrl) throws ApiException;

}
