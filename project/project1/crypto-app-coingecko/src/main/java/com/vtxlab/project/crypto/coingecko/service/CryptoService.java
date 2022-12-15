package com.vtxlab.project.crypto.coingecko.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.vtxlab.project.crypto.coingecko.exception.ApiException;
import com.vtxlab.project.crypto.coingecko.model.cryptoall.coin.Coin;
import com.vtxlab.project.crypto.coingecko.model.cryptoall.price.CryptoRates;

import java.util.List;
import java.util.Map;

public interface CryptoService {
    Coin[] getCurrentPrice() throws ApiException;

    Map<String, CryptoRates> getSimplePrices(List<String> ids, List<String> currency) throws ApiException, JsonProcessingException;
}
