package questions.leetcode.pascaltriangle;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(List.of(1));
        for (int i = 1; i < numRows; i++) {
            ans.add(rowGenerator(i));
        }
        return ans;
    }

    public static List<Integer> rowGenerator(int row) {
        List<Integer> rowList = new ArrayList<>();
            for (int i = 0; i < row + 1; i++) {
                rowList.add(combatorics(row, i));
            }
        return rowList;
    }

    public static int combatorics(int n, int r) {
        return (factorial(n).divide(factorial(r).multiply(factorial(n - r)))).intValue();
    }

    public static BigDecimal factorial(int n) {
        if (n < 2) {
            return BigDecimal.ONE;
        }
        BigDecimal b = new BigDecimal(n);
        return b.multiply(factorial(n - 1));
    }

    public static void main(String[] args) {
        System.out.println(generate(14));
    }


}
