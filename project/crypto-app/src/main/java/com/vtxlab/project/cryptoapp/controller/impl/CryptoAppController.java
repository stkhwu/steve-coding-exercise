package com.vtxlab.project.cryptoapp.controller.impl;


import com.vtxlab.project.cryptoapp.controller.CryptoAppOperation;
import com.vtxlab.project.cryptoapp.exception.ApiException;
import com.vtxlab.project.cryptoapp.model.cryptoall.coin.Coin;
import com.vtxlab.project.cryptoapp.model.dto.CoinDto;
import com.vtxlab.project.cryptoapp.service.CryptoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/crypto/api/v1")
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
}
