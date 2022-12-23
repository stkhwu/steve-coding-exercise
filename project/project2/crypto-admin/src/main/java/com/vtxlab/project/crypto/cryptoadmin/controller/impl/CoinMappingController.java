package com.vtxlab.project.crypto.cryptoadmin.controller.impl;

import com.vtxlab.project.crypto.cryptoadmin.controller.CoinMappingOperation;
import com.vtxlab.project.crypto.cryptoadmin.entity.ChannelCoinMapping;
import com.vtxlab.project.crypto.cryptoadmin.service.CoinMappingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/crypto/admin/api/v1")
public class CoinMappingController implements CoinMappingOperation {

    @Autowired
    CoinMappingService coinMappingService;

    @Override
    public ChannelCoinMapping save(Long id, ChannelCoinMapping channelCoinMapping) {
        return coinMappingService.save(id, channelCoinMapping);
    }

    @Override
    public List<ChannelCoinMapping> getChannelId(Long id) {
        return coinMappingService.findByChannelId(id);
    }
}
