package com.vtxlab.project.crypto.polygon.controller.impl;

import com.vtxlab.project.crypto.polygon.controller.CryptoAppOperation;
import com.vtxlab.project.crypto.polygon.exception.ApiException;
import com.vtxlab.project.crypto.polygon.exception.ApiRunTimeException;
import com.vtxlab.project.crypto.polygon.model.cryptoall.Polygon;
import com.vtxlab.project.crypto.polygon.model.dto.ChannelDto;
import com.vtxlab.project.crypto.polygon.model.exchangerates.ExchangeRate;
import com.vtxlab.project.crypto.polygon.service.CryptoService;
import lombok.extern.slf4j.Slf4j;
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
public class CryptoAppAppController implements CryptoAppOperation {

    @Autowired
    CryptoService cryptoService;

    @Override
    public ResponseEntity<ChannelDto> getPriceInCurrency(List<String> coins, String currency) throws ApiException {

        List<ExchangeRate> exRates = new ArrayList<>();

        coins.forEach(e -> {
            // set Crypto to USD
            BigDecimal rate = safeGetPriceInCurrency(e, currency).getResults().get(0).getClosePrice();
            exRates.add(new ExchangeRate(e, currency, rate));
            // set USD to Crypto
            exRates.add(new ExchangeRate(currency, e,
                    BigDecimal.ONE.divide(rate, new MathContext(6, RoundingMode.HALF_UP))));
        });


        return ResponseEntity.ok().body(new ChannelDto(exRates));
    }

    Polygon safeGetPriceInCurrency(String coin, String currency) {
        try {
            return cryptoService.getPriceInCurrency(coin, currency);
        } catch (ApiException e) {
            throw new ApiRunTimeException(e);
        }
    }
}
