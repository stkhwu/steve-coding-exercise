package com.vtxlab.project.cryptoapp.model.cryptoall;

import com.vtxlab.project.cryptoapp.model.cryptoall.coin.Coin;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class CryptoHolder implements Serializable {

    List<Coin> coins;
}
