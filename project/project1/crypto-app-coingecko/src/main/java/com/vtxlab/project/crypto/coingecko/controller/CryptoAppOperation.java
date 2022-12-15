package com.vtxlab.project.crypto.coingecko.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.vtxlab.project.crypto.coingecko.exception.ApiException;
import com.vtxlab.project.crypto.coingecko.model.cryptoall.coin.Coin;
import com.vtxlab.project.crypto.coingecko.model.dto.ChannelDto;
import com.vtxlab.project.crypto.coingecko.model.dto.CoinDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping(value = "/default")
@CrossOrigin(origins = "*")
public interface CryptoAppOperation {

    @GetMapping(value = "/coin/market")
    ResponseEntity<CoinDto[]> getCurrentPrice() throws ApiException;

    @GetMapping(value = "/coin/markets")
    ResponseEntity<Coin[]> getCurrentPrices() throws ApiException;

    @GetMapping(value = "/coingecko")
    ResponseEntity<ChannelDto> getSimplePrices(@RequestParam List<String> ids, @RequestParam List<String> currency) throws ApiException, JsonProcessingException;

}
