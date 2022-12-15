package com.vtxlab.project.crypto.polygon.model.cryptoall;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Polygon implements Serializable {
    String ticker;

    BigDecimal queryCount;

    BigDecimal resultsCount;

    Boolean adjusted;

    List<Result> results;

    String status;

    @JsonProperty(value = "request_id")
    String requestId;

    BigDecimal count;
}
//    "ticker": "X:BTCUSD",
//    "queryCount": 1,
//    "resultsCount": 1,
//    "adjusted": true,
//    "results": [
//        {
//            "T": "X:BTCUSD",
//            "v": 63752.86056785,
//            "vw": 17945.9889,
//            "o": 17772.98,
//            "c": 17800,
//            "h": 18391,
//            "l": 17656.6,
//            "t": 1671062399999,
//            "n": 962479
//        }
//    ],
//    "status": "OK",
//    "request_id": "9da43cf976ff7ac601c7aec7d5b255ac",
//    "count": 1