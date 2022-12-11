package mock.marketdata;

import mock.marketdata.impl.MarketDataSnapshot;

public interface MarketData {
    void receive(String symbol, int price);

    MarketDataSnapshot getMarketData();
}
