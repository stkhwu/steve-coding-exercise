package com.vtxlab.project.crypto.cryptoadmin.service.impl;

import com.vtxlab.project.crypto.cryptoadmin.entity.Channel;
import com.vtxlab.project.crypto.cryptoadmin.repository.ChannelRepository;
import com.vtxlab.project.crypto.cryptoadmin.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.List;
import java.util.UUID;

@Service
public class ChannelServiceHolder implements ChannelService {

    @Autowired
    ChannelRepository channelRepository;

    @Autowired
    RedisTemplate<String, Channel> redisTemplate;

    @Override
    public Channel getChannelByTranTypeAndSourceApp(String tranType, String sourceApp) {
        return channelRepository.findByChannelTransactionsTranTypeAndChannelTransactionsSourceApp(tranType, sourceApp);
    }

    @Override
    public List<Channel> getAllChannels() {
        return channelRepository.findAll();
    }

    @Override
    public Boolean isChannelCodeExist(String channelCode) {
        return channelRepository.existsByChannelCode(channelCode);
    }

    @Override
    public Channel saveChannel(Channel channel, UUID uuid) {
        String redisKey = "crypto:admin:post:channel:uuid:" + uuid;
        if (redisTemplate.opsForValue().get(redisKey) != null) {
            return null;
        }
        Channel savedChannel = channelRepository.save(channel);
        redisTemplate.opsForValue().set(redisKey,
                savedChannel,
                Duration.ofDays(1));
        return savedChannel;
    }

    @Override
    public Channel submitChannel(Channel channel, UUID uuid) {
        if(!isChannelCodeExist(channel.getChannelCode())) {
            return saveChannel(channel, uuid);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public Channel updateChannel(Channel channel, Long id) {
        if (channelRepository.existsById(id)) {
            return channelRepository.save(channel);
        }
        return null;
    }
}
