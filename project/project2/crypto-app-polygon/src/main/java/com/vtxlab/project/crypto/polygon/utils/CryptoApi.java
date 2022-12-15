package com.vtxlab.project.crypto.polygon.utils;

import com.vtxlab.project.crypto.polygon.exception.ApiException;
import com.vtxlab.project.crypto.polygon.model.cryptoall.Polygon;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.time.Duration;
import java.util.Collections;
import java.util.Map;

@Component
@Slf4j
public class CryptoApi {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    RedisTemplate<String, Polygon> redisTemplate;

    public <T> T invokeWithSpecialParam(String baseUrl, String serviceVers, String serviceUrl, Map<String, String> queryParams, String specialParam, Class<T> returnType) throws ApiException {
        try {
            UriComponentsBuilder url = UriComponentsBuilder.fromUriString(baseUrl) //
                    .pathSegment(serviceVers)//
                    .path(serviceUrl); //

            for (Map.Entry<String, String> entry : queryParams.entrySet()) {
                url = url.queryParam(entry.getKey(), entry.getValue());
            }

            String urlString = url.build().expand(Collections.singletonMap("param", specialParam)).toString();
            log.info(urlString);

            return restTemplate.getForObject(urlString, returnType);

        } catch (Exception e) {
            e.printStackTrace();
            throw new ApiException(80003, "Calling Crypto service fail");
        }
    }

    public <T> T invokeWithSpecialParamRedis(String baseUrl, String serviceVers, String serviceUrl,
                                             Map<String, String> queryParams, String specialParam, Class<T> returnType,
                                             String redisKey, Duration redisKeyDuration) throws ApiException {


        // Check if the redisKey still exist in redis database
        Polygon polygon = //
                redisTemplate.opsForValue().get(redisKey);

        // Check if the status still exists in redis
        // if yes, return
        if (polygon != null) {
            return (T) polygon;
        }

        polygon = invokeWithSpecialParam(baseUrl, serviceVers, serviceUrl, queryParams, specialParam, Polygon.class);

        // Set Timeout
        redisTemplate.opsForValue().set(redisKey, polygon, redisKeyDuration);

        return (T) polygon;
    }
}
