package com.vtxlab.project.crypto.polygon.controller;


import com.vtxlab.project.crypto.polygon.exception.ApiException;
import com.vtxlab.project.crypto.polygon.model.cryptoall.Polygon;
import com.vtxlab.project.crypto.polygon.model.dto.ChannelDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping(value = "/default")
public interface CryptoAppOperation {
//http://localhost:8086/crpyto/api/v1/polygon/price?coins=BTC,ETH,USDT,XRP,DOGE&currency=USD

    @GetMapping(value = "/polygon/price")
    ResponseEntity<ChannelDto> getPriceInCurrency(@RequestParam List<String> coins, @RequestParam String currency) throws ApiException;
}
