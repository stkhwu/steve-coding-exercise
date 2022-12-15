package com.vtxlab.project.crypto.polygon.model.exchangerates;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExchangeRate implements Serializable {
    private String fromCurr;

    private String toCurr;

    private BigDecimal rate;
}
