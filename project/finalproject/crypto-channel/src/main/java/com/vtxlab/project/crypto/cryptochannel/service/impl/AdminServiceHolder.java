package com.vtxlab.project.crypto.cryptochannel.service.impl;

import com.vtxlab.project.crypto.cryptochannel.exception.ApiException;
import com.vtxlab.project.crypto.cryptochannel.model.Channel;
import com.vtxlab.project.crypto.cryptochannel.model.ChannelCoinMapping;
import com.vtxlab.project.crypto.cryptochannel.service.AdminService;
import com.vtxlab.project.crypto.cryptochannel.utils.ChannelApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Service
public class AdminServiceHolder implements AdminService {

    @Autowired
    ChannelApi channelApi;

    @Value("${service.admin.baseUrl}")
    String baseUrl;

    @Value("${service.admin.serviceVers}")
    String serviceVers;

    @Value("${service.admin.endpoint.channel-url1}")
    String channelUrl1;

    @Value("${service.admin.endpoint.coinmap-url}")
    String coinMapUrl;

    @Value("${service.admin.endpoint.channel-url2}")
    String channelUrl2;

    @Override
    public Channel getChannelBySourceAppAndTranType(String sourceApp,
                                                    String tranType) throws ApiException {
        // Invoke vtxlab-crypto-admin API
        HashMap<String, String> hMap = new HashMap<>();
        hMap.put("sourceApp", sourceApp);
        hMap.put("tranType", tranType);

        return channelApi.invoke(baseUrl, serviceVers,
                channelUrl1, // /channel?sourceApp=xxx&tranType=xxx
                hMap, Channel.class);
    }

    @Override
    public List<ChannelCoinMapping> getCoinMappings(Long id) throws ApiException {
        return new ArrayList<>(Arrays.asList(channelApi.invoke(baseUrl,
                serviceVers,
                coinMapUrl.replace("{id}", String.valueOf(id)), // /channel/{id}/coinmap
                new HashMap<String, String>(),
                ChannelCoinMapping[].class)));
    }

    @Override
    public Channel getChannelByChannelCode(String channelCode)
            throws ApiException {
        return channelApi.invoke(baseUrl,
                serviceVers,
                channelUrl2.replace("{code}", channelCode), // /channel/{code}
                new HashMap<String, String>(),
                Channel.class);
    }
}
