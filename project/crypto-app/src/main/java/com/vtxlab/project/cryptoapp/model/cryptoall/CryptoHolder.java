package com.vtxlab.project.cryptoapp.model.cryptoall;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.vtxlab.project.cryptoapp.model.cryptoall.coin.Coin;
import com.vtxlab.project.cryptoapp.model.dto.CoinDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
public class CryptoHolder implements Serializable {

    List<Coin> coins;
}
