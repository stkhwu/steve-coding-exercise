package com.vtxlab.project.crypto.cryptochannel.service.impl;

import com.vtxlab.project.crypto.cryptochannel.exception.ApiException;
import com.vtxlab.project.crypto.cryptochannel.model.Channel;
import com.vtxlab.project.crypto.cryptochannel.model.dto.ChannelDto;
import com.vtxlab.project.crypto.cryptochannel.service.ThirdPartyService;
import com.vtxlab.project.crypto.cryptochannel.utils.ChannelApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ThirdPartyServiceHolder implements ThirdPartyService {

    @Autowired
    ChannelApi channelApi;

    @Override
    public ChannelDto getThirdPartyExchangeRates(List<String> cryptos, List<String> currencies,
                                                 String domain, String domainVers,
                                                 String serviceUrl) throws ApiException {

        Map<String, String> hMap = new HashMap<>();
        hMap.put("cryptos", String.join(",", cryptos));
        hMap.put("currencies", String.join(",", currencies));

        return channelApi.invoke(domain, //
                domainVers, serviceUrl, //
                hMap, ChannelDto.class);
    }
}
