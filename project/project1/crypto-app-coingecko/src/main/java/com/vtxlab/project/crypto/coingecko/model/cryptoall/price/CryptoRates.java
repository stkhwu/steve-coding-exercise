package com.vtxlab.project.crypto.coingecko.model.cryptoall.price;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class CryptoRates implements Serializable{

    BigDecimal usd;

    BigDecimal hkd;
}
