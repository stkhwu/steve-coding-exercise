package com.vtxlab.project.crypto.coingecko.model.dto;

//{
//  "exchangeRates": [
//    {
//      "fromCurr": "bitcoin",
//      "toCurr" : "USD",
//      "rate" : 4.5
//    },
//    {
//      "fromCurr": "USD",
//      "toCurr" : "bitcoin",
//      "rate" : 0.15
//    }
//  ]
//}

import com.vtxlab.project.crypto.coingecko.model.exchangerate.ExchangeRate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChannelDto implements Serializable {

    List<ExchangeRate> exchangeRates;

}


