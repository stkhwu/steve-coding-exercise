package com.vtxlab.project.crypto.polygon.config;

import com.vtxlab.project.crypto.polygon.model.cryptoall.Polygon;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisTemplateConfig {

    @Bean
    public RedisTemplate<String, Polygon> redisTemplate(RedisConnectionFactory connectionFactory) {
        RedisTemplate<String, Polygon> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(connectionFactory);
        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(stringRedisSerializer);
        // Add some specific configuration here. Key serializers, etc.
        return redisTemplate;
    }
}
