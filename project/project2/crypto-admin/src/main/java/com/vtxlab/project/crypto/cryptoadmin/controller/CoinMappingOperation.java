package com.vtxlab.project.crypto.cryptoadmin.controller;

import com.vtxlab.project.crypto.cryptoadmin.entity.ChannelCoinMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/default")
public interface CoinMappingOperation {

    @PostMapping(value = "/channel/{id}/coinmap")
    ChannelCoinMapping save(@PathVariable Long id, @RequestBody ChannelCoinMapping channelCoinMapping);

    @GetMapping(value = "/channel/{id}/coinmap")
    List<ChannelCoinMapping> getChannelId(@PathVariable Long id);
}
