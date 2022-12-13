package com.vtxlab.project.cryptoapp.controller;


import com.vtxlab.project.cryptoapp.exception.ApiException;
import com.vtxlab.project.cryptoapp.model.cryptoall.coin.Coin;
import com.vtxlab.project.cryptoapp.model.dto.CoinDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/default")
@CrossOrigin(origins = "*")
public interface CryptoAppOperation {

    @GetMapping(value = "/coin/market")
    ResponseEntity<CoinDto[]> getCurrentPrice() throws ApiException;

    @GetMapping(value = "/coin/markets")
    ResponseEntity<Coin[]> getCurrentPrices() throws ApiException;
}
