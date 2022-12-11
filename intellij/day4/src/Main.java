import ex1.Factorial;
import mock.marketdata.MarketData;
import mock.marketdata.impl.MarketDataSnapshot;
import mock.reversestring.ReverseString;

public class Main {
    public static void main(String[] args) {

        MarketData mds = new MarketDataSnapshot();

        mds.receive("0700.hk", 325);
        mds.receive("9988.hk", 92);
        mds.receive("0005.hk", 48);
        mds.receive("9988.hk", 91);
        mds.receive("0700.hk", 324);

        mds.getMarketData();


        System.out.println(ReverseString.reverse("ABCDEFG"));
    }
}