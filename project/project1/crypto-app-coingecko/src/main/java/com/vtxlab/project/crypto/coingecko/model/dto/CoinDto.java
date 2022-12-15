package com.vtxlab.project.crypto.coingecko.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class CoinDto implements Serializable {

    @JsonProperty(value = "id")
    String id;

    @JsonProperty(value = "symbol")
    String symbol;

    @JsonProperty(value = "name")
    String name;

    @JsonProperty(value = "image")
    String image;

    @JsonProperty(value = "current_price")
    BigDecimal currentPrice;

    @JsonProperty(value = "market_cap")
    BigDecimal marketCap;

    @JsonProperty(value = "market_cap_rank")
    BigDecimal marketCapRank;

    @JsonProperty(value = "total_volume")
    BigDecimal totalVolume;

    @JsonProperty(value = "price_change_percentage_24h")
    BigDecimal priceChangePercentage24h;


}
