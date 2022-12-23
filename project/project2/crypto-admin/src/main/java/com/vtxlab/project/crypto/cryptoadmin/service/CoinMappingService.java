package com.vtxlab.project.crypto.cryptoadmin.service;

import com.vtxlab.project.crypto.cryptoadmin.entity.ChannelCoinMapping;

import java.util.List;

public interface CoinMappingService {

    ChannelCoinMapping save(Long id, ChannelCoinMapping channelCoinMapping);

    List<ChannelCoinMapping> findByChannelId(Long id);
}
