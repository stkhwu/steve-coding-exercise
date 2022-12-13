package com.vtxlab.project.cryptoapp.service.impl;

import com.vtxlab.project.cryptoapp.exception.ApiException;
import com.vtxlab.project.cryptoapp.model.cryptoall.coin.Coin;
import com.vtxlab.project.cryptoapp.service.CryptoService;
import com.vtxlab.project.cryptoapp.utils.CryptoApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Service
public class CryptoServiceHolder implements CryptoService {

    @Autowired
    CryptoApi cryptoApi;

    @Value("${rest.crypto.baseUrl}")
    String baseUrl;

    @Value("${rest.crypto.serviceVers}")
    String serviceVers;

    @Value("${rest.crypto.serviceUrl}")
    String serviceUrl;


    @Override
    public Coin[] getCurrentPrice() throws ApiException {

        Map<String, String> cMap = new HashMap<>();
        cMap.put("vs_currency", "usd");
        cMap.put("order", "market_cap_desc");
        cMap.put("per_page", String.valueOf(100));
        cMap.put("page", String.valueOf(1));
        cMap.put("sparkline", String.valueOf(false));

        Coin[] coins = cryptoApi.invoke(baseUrl, serviceVers, serviceUrl, cMap, Coin[].class);
        log.info(Arrays.toString(coins));

        return coins;
    }

}
