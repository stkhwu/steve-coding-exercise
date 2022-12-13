package com.vtxlab.project.cryptoapp.model.cryptoall.coin.roi;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class Roi implements Serializable {

    BigDecimal times;

    String currency;

    BigDecimal percentage;

    //"times": 97.47415677517,
    //      "currency": "btc",
    //      "percentage": 9747.415677517
}
