package com.vtxlab.project.crypto.cryptoadmin.controller;

import com.vtxlab.project.crypto.cryptoadmin.entity.Channel;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping(value = "/default")
public interface ChannelOperation {

    @GetMapping(value = "/channel")
    Channel getChannelByTranTypeAndSourceApp(@RequestParam String tranType, @RequestParam String sourceApp);

    @GetMapping(value = "/channels")
    List<Channel> getAllChannel();

    @PostMapping(value = "/channel")
    ResponseEntity<Channel> saveChannel(@RequestBody Channel channel, @RequestParam UUID uuid);

    @PutMapping(value = "/channel/{id}")
    Channel updateChannel(@RequestBody Channel channel, @PathVariable Long id);

    @PostMapping(value = "/channel-submit")
    Channel submitChannel(@RequestBody Channel channel, UUID uuid);
}
