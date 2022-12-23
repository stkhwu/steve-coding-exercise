package com.vtxlab.project.crypto.cryptoadmin.controller.impl;

import com.vtxlab.project.crypto.cryptoadmin.controller.ChannelOperation;
import com.vtxlab.project.crypto.cryptoadmin.entity.Channel;
import com.vtxlab.project.crypto.cryptoadmin.service.ChannelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@Slf4j
@RestController
@RequestMapping(value = "/crypto/admin/api/v1")
public class ChannelController implements ChannelOperation {

    @Autowired
    ChannelService channelService;

    @Override
    public Channel getChannelByTranTypeAndSourceApp(String tranType, String sourceApp) {
        return channelService.getChannelByTranTypeAndSourceApp(tranType, sourceApp);
    }

    @Override
    public List<Channel> getAllChannel() {
        return channelService.getAllChannels();
    }

    @Override
    public ResponseEntity<Channel> saveChannel(Channel channel, UUID uuid) {
        Channel savedChannel = channelService.saveChannel(channel, uuid);
        if (savedChannel == null){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(savedChannel);
    }

    @Override
    public Channel updateChannel(Channel channel, Long id) {
        return channelService.updateChannel(channel,id);
    }

    @Override
    public Channel submitChannel(Channel channel, UUID uuid) {
        return channelService.submitChannel(channel, uuid);
    }
}
