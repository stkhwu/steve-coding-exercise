package questions.leetcode.plusone;

import java.util.Arrays;

public class PlusOne {
  public static void main(String[] args) {
    int[] digits = new int[] { 9,9 };

    /*
     * String digit = "";
     * for (int i : digits) {
     * digit = digit + String.valueOf(i);
     * }
     * int j = Integer.valueOf(digit) + 1;
     * int[] ans = new int[String.valueOf(j).length()];
     * int temp = j;
     * for (int i = ans.length - 1; i > -1; i--) {
     * ans[i] = temp % 10;
     * temp = (temp - temp % 10) / 10;
     * }
     */
    
    digits[digits.length - 1] = digits[digits.length - 1] + 1;
      for (int i = digits.length - 1; i > 0; i--) {
        if (digits[i] > 9) {
          digits[i] = 0;
          digits[i - 1] = digits[i - 1] + 1;
        }
      }
      

    if (digits[0] == 10) {
      int[] a = new int[digits.length + 1];
      a[0] = 1;
      System.out.println(Arrays.toString(a));
    } else {
      System.out.println(Arrays.toString(digits));
    }
  
  }
}
