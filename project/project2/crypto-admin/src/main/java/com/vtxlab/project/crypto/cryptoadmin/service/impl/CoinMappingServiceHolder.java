package com.vtxlab.project.crypto.cryptoadmin.service.impl;

import com.vtxlab.project.crypto.cryptoadmin.entity.ChannelCoinMapping;
import com.vtxlab.project.crypto.cryptoadmin.repository.ChannelRepository;
import com.vtxlab.project.crypto.cryptoadmin.repository.CoinMappingRepository;
import com.vtxlab.project.crypto.cryptoadmin.service.CoinMappingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoinMappingServiceHolder implements CoinMappingService {

    @Autowired
    CoinMappingRepository coinMappingRepository;

    @Autowired
    ChannelRepository channelRepository;

    @Override
    public ChannelCoinMapping save(Long id, ChannelCoinMapping channelCoinMapping) {
        return channelRepository.findById(id).map(e -> {
            channelCoinMapping.setChannel(e);
            coinMappingRepository.save(channelCoinMapping);
            return channelCoinMapping;
        }).orElse(null);
    }


    @Override
    public List<ChannelCoinMapping> findByChannelId(Long id) {
        return coinMappingRepository.findByChannelId(id);
    }
}
