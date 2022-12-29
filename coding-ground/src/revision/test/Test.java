package revision.test;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Test {
    // return the n-th (0 < n < 10,000) number whose cube ends in 44.
    // running time: O(n)
    public static String getNthIntegerWhoseCubeEndsIn44(String n) throws NumberFormatException {
        int num = Integer.parseInt(n);
        if (num >= 10000 || num <= 0) {
            throw new NumberFormatException();
        }
        int count = 0;
        for (long i = 1; i < Integer.MAX_VALUE; i++) {
            long l = i * i * i;
            if (l % 100 == 44) {
                count++;
                if (count == num) {
                    return String.valueOf(i);
                }
            }
        }
        return null;
    }

    // return the n-th (0 < n < 9,223,372,036,854,775,807) number whose cube ends in 888.
// running time: O(1)
    public static String getkthIntegerWhoseCubeEndsIn888(String n) throws NumberFormatException {
        BigInteger b = new BigInteger(n);
        BigInteger ans = BigInteger.valueOf(-58);
        final BigInteger INTERVAL = BigInteger.valueOf(250);
        return ans.add(INTERVAL.multiply(b)).toString();



    }

    // Above methods will THROW NumberFormatException if the input is invalid.
}
