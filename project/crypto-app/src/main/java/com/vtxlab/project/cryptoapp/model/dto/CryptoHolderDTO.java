package com.vtxlab.project.cryptoapp.model.dto;

import com.vtxlab.project.cryptoapp.model.cryptoall.coin.Coin;

import java.io.Serializable;
import java.util.List;

public class CryptoHolderDTO implements Serializable {

    List<CoinDto> coins;
}
