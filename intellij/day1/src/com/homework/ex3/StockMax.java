package com.homework.ex3;

public class StockMax {

    public static int findMaxProfit(int[] prices) {
        int max = 0;
        int refPt = prices[0];
        for (int price: prices) {
            if (price < refPt) {
                refPt = price;
                continue;
            }
            if(price - refPt > max) {
                max = price - refPt;
            }
        }
        return max;
    }
}
