package com.vtxlab.project.cryptoapp.service;

import com.vtxlab.project.cryptoapp.exception.ApiException;
import com.vtxlab.project.cryptoapp.model.cryptoall.CryptoHolder;
import com.vtxlab.project.cryptoapp.model.cryptoall.coin.Coin;

public interface CryptoService {
    Coin[] getCurrentPrice() throws ApiException;

}
