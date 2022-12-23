package com.vtxlab.project.crypto.cryptoadmin.service;

import com.vtxlab.project.crypto.cryptoadmin.entity.Channel;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

public interface ChannelService {
    Channel getChannelByTranTypeAndSourceApp(String tranType, String sourceApp);

    List<Channel> getAllChannels();

    Boolean isChannelCodeExist(String channelCode);

    Channel saveChannel(Channel channel, UUID uuid);

    Channel updateChannel(Channel channel, Long id);

    Channel submitChannel(Channel channel, UUID uuid);
}
