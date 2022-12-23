package com.vtxlab.project.crypto.cryptochannel.service;

import com.vtxlab.project.crypto.cryptochannel.exception.ApiException;
import com.vtxlab.project.crypto.cryptochannel.model.Channel;
import com.vtxlab.project.crypto.cryptochannel.model.ChannelCoinMapping;

import java.util.List;

public interface AdminService {

    Channel getChannelBySourceAppAndTranType(String sourceApp, String tranType) throws ApiException;

    List<ChannelCoinMapping> getCoinMappings(Long id) throws ApiException;

    Channel getChannelByChannelCode(String channelCode) throws ApiException;

}
