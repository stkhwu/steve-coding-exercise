package com.vtxlab.project.crypto.cryptoadmin.config;

import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import com.vtxlab.project.crypto.cryptoadmin.entity.Channel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisTemplateConfig {
    @Bean
    public RedisTemplate<String, Channel> redisTemplate(RedisConnectionFactory connectionFactory) {
        RedisTemplate<String, Channel> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(connectionFactory);
        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(stringRedisSerializer);
        // Add some specific configuration here. Key serializers, etc.
        return redisTemplate;
    }
}
