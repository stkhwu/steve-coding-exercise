package com.vtxlab.project.crypto.coingecko.controller.impl;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.vtxlab.project.crypto.coingecko.controller.CryptoAppOperation;
import com.vtxlab.project.crypto.coingecko.exception.ApiException;
import com.vtxlab.project.crypto.coingecko.model.cryptoall.coin.Coin;
import com.vtxlab.project.crypto.coingecko.model.dto.ChannelDto;
import com.vtxlab.project.crypto.coingecko.model.dto.CoinDto;
import com.vtxlab.project.crypto.coingecko.model.exchangerate.ExchangeRate;
import com.vtxlab.project.crypto.coingecko.service.CryptoService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/crypto/api/v1")
@Slf4j
public class CryptoAppController implements CryptoAppOperation {

    @Autowired
    CryptoService cryptoService;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public ResponseEntity<CoinDto[]> getCurrentPrice() throws ApiException {
        CoinDto[] coinDto = modelMapper.map(cryptoService.getCurrentPrice(), CoinDto[].class);
        return ResponseEntity.ok().body(coinDto);

    }

    @Override
    public ResponseEntity<Coin[]> getCurrentPrices() throws ApiException {
        return ResponseEntity.ok().body(cryptoService.getCurrentPrice());
    }

    @Override
    public ResponseEntity<ChannelDto> getSimplePrices(List<String> ids, List<String> currency) throws ApiException, JsonProcessingException {
        List<ExchangeRate> exRates = new ArrayList<>();

//        Map<String, CryptoRates> cc = cryptoService.getSimplePrices(ids, currency);
//        log.info(cc.toString());
//          cc.forEach((a,b) -> log.info(a));
        cryptoService.getSimplePrices(ids, currency).forEach((a, b) -> {
            // Set Crypto to USD
            exRates.add(new ExchangeRate(a, "USD", b.getUsd()));

            // Set Crypto to HKD
            exRates.add(new ExchangeRate(a, "HKD", b.getHkd()));

            // Set USD to Crypto
            exRates.add(new ExchangeRate("USD", a, BigDecimal.ONE.divide(b.getUsd(), new MathContext(6, RoundingMode.HALF_UP))));

            // Set HKD to Crypto
            exRates.add(new ExchangeRate("HKD", a, BigDecimal.ONE.divide(b.getHkd(), new MathContext(6, RoundingMode.HALF_UP))));
        });


        return ResponseEntity.ok().body(new ChannelDto(exRates));
    }
}
