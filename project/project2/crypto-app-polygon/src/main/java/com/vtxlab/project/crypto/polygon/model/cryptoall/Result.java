package com.vtxlab.project.crypto.polygon.model.cryptoall;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result implements Serializable {

    @JsonProperty(value = "T")
    String exchangeSymbol;

    @JsonProperty(value = "v")
    BigDecimal tradingVolume;

    @JsonProperty(value = "vw")
    BigDecimal volumeWeightedAveragePrice;

    @JsonProperty(value = "o")
    BigDecimal openPrice;

    @JsonProperty(value = "c")
    BigDecimal closePrice;

    @JsonProperty(value = "h")
    BigDecimal highestPrice;

    @JsonProperty(value = "l")
    BigDecimal lowestPrice;

    @JsonProperty(value = "t")
    BigDecimal timestamp;

    @JsonProperty(value = "n")
    BigDecimal numberOfTransaction;

    public BigDecimal getClosePrice(){
        return this.closePrice;
    }
}