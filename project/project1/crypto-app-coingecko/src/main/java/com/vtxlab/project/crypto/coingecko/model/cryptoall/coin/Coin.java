package com.vtxlab.project.crypto.coingecko.model.cryptoall.coin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coin implements Serializable {

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

    @JsonProperty(value = "fully_diluted_valuation")
    BigDecimal fullyDilutedValuation;

    @JsonProperty(value = "total_volume")
    BigDecimal totalVolume;

    @JsonProperty(value = "high_24h")
    BigDecimal high24h;

    @JsonProperty(value = "low_24h")
    BigDecimal low24h;

    @JsonProperty(value = "price_change_24h")
    BigDecimal priceChange24h;

    @JsonProperty(value = "price_change_percentage_24h")
    BigDecimal priceChangePercentage24h;

    @JsonProperty(value = "market_cap_change_24h")
    BigDecimal marketCapChange24h;

    @JsonProperty(value = "market_cap_change_percentage_24h")
    BigDecimal marketCapChangePercentage24h;

    @JsonProperty(value = "circulating_supply")
    BigDecimal circulatingSupply;

    @JsonProperty(value = "total_supply")
    BigDecimal totalSupply;

    @JsonProperty(value = "max_supply")
    BigDecimal maxSupply;

    @JsonProperty(value = "ath")
    BigDecimal ath;

    @JsonProperty(value = "ath_change_percentage")
    BigDecimal athChangePercentage;

    @JsonProperty(value = "ath_date")
    LocalDateTime athDate;

    @JsonProperty(value = "atl")
    BigDecimal atl;

    @JsonProperty(value = "atl_change_percentage")
    BigDecimal atlChangePercentage;

    @JsonProperty(value = "atl_date")
    LocalDateTime atlDate;

    @JsonProperty(value = "roi")
    Roi roi;

    @JsonProperty(value = "last_updated")
    LocalDateTime lastUpdated;

//"id": "bitcoin",
//    "symbol": "btc",
//    "name": "Bitcoin",
//    "image": "https://assets.coingecko.com/coins/images/1/large/bitcoin.png?1547033579",
//    "current_price": 16951.97,
//    "market_cap": 325410191792,
//    "market_cap_rank": 1,
//    "fully_diluted_valuation": 355336274407,
//    "total_volume": 18998610853,
//    "high_24h": 17256.59,
//    "low_24h": 16869.54,
//    "price_change_24h": -207.84485189793122,
//    "price_change_percentage_24h": -1.21123,
//    "market_cap_change_24h": -4704775023.96106,
//    "market_cap_change_percentage_24h": -1.42519,
//    "circulating_supply": 19231400,
//    "total_supply": 21000000,
//    "max_supply": 21000000,
//    "ath": 69045,
//    "ath_change_percentage": -75.4614,
//    "ath_date": "2021-11-10T14:24:11.849Z",
//    "atl": 67.81,
//    "atl_change_percentage": 24885.79917,
//    "atl_date": "2013-07-06T00:00:00.000Z",
//    "roi": null,
//    "last_updated": "2022-12-12T04:20:21.164Z"
}

@Data
class Roi implements Serializable {

    BigDecimal times;

    String currency;

    BigDecimal percentage;

    //"times": 97.47415677517,
    //      "currency": "btc",
    //      "percentage": 9747.415677517
}
