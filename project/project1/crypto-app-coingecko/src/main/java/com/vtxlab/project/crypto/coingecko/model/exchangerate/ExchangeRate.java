package com.vtxlab.project.crypto.coingecko.model.exchangerate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExchangeRate implements Serializable {
    private String fromCurr;

    private String toCurr;

    private BigDecimal rate;
}
