package com.vtxlab.project.crypto.polygon.service.impl;

import com.vtxlab.project.crypto.polygon.exception.ApiException;
import com.vtxlab.project.crypto.polygon.model.cryptoall.Polygon;
import com.vtxlab.project.crypto.polygon.service.CryptoService;
import com.vtxlab.project.crypto.polygon.utils.CryptoApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class CryptoServiceHolder implements CryptoService {

    @Autowired
    CryptoApi cryptoApi;

    @Value("${rest.crypto.baseUrl}")
    String baseUrl;

    @Value("${rest.crypto.serviceVers}")
    String serviceVers;

    @Value("${rest.crypto.serviceUrl}")
    String serviceUrl;

    @Value("${rest.crypto.apiKey}")
    String apiKey;

    @Override
    public Polygon getPriceInCurrency(String coins, String currency) throws ApiException {

        String redisKey = "crypto:polygon:response".concat(coins).concat(currency);

        Map<String, String> cMap = new HashMap<>();
        cMap.put("adjusted", "true");
        cMap.put("apiKey", apiKey);

        String specialParam = coins + currency;
        log.info(specialParam);

        return cryptoApi.invokeWithSpecialParamRedis(baseUrl, serviceVers, serviceUrl, cMap, specialParam, Polygon.class, redisKey, Duration.ofMinutes(5));
    }


}
