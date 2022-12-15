package com.vtxlab.project.crypto.polygon.service;

import com.vtxlab.project.crypto.polygon.exception.ApiException;
import com.vtxlab.project.crypto.polygon.model.cryptoall.Polygon;

import java.util.List;

public interface CryptoService {

    Polygon getPriceInCurrency(String coins, String currency) throws ApiException;
}
