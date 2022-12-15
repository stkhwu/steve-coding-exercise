package com.vtxlab.project.crypto.coingecko.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vtxlab.project.crypto.coingecko.exception.ApiException;
import com.vtxlab.project.crypto.coingecko.model.cryptoall.coin.Coin;
import com.vtxlab.project.crypto.coingecko.model.cryptoall.price.CryptoRates;
import com.vtxlab.project.crypto.coingecko.model.dto.CryptoRatesMap;
import com.vtxlab.project.crypto.coingecko.service.CryptoService;
import com.vtxlab.project.crypto.coingecko.utils.CryptoApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.*;

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

    final String simplePriceUrl = "simple/price";

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

    @Override
    public Map<String, CryptoRates> getSimplePrices(List<String> ids, List<String> currency) throws ApiException, JsonProcessingException {

        Map<String, String> cMap = new HashMap<>();
        String idStr = String.join(",", ids);
        String currencyStr = String.join(",", currency);
        cMap.put("ids", idStr);
        cMap.put("vs_currencies", currencyStr);

        return cryptoApi.invoke(baseUrl, serviceVers, simplePriceUrl, cMap, CryptoRatesMap.class);
    }
}
