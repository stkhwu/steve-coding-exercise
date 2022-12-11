package mock.marketdata.impl;

import mock.marketdata.MarketData;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MarketDataSnapshot implements MarketData {

    Map<String, Integer> mDS;

    public MarketDataSnapshot() {
        mDS = new LinkedHashMap<>();
    }

    @Override
    public void receive(String symbol, int price) {
        mDS.put(symbol, price);
    }

    @Override
    public MarketDataSnapshot getMarketData() {
        mDS.forEach((k,v) -> System.out.println("symbol: "+ k + "price: " + v));
        return null;
    }

}
