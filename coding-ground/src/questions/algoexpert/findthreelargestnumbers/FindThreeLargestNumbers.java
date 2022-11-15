package questions.algoexpert.findthreelargestnumbers;

import java.util.Arrays;

public class FindThreeLargestNumbers {
  

  public static int[] findThreeLargestNumbers(int[] array) {
    // Write your code here.
    int[] ans = Arrays.copyOf(array, 3);
    Arrays.sort(ans);

    for (int i = 3; i < array.length; i++) {
      if (array[i] > ans[0]) {
        ans[0] = array[i];
        Arrays.sort(ans);
      }
    }


    return ans;
  }
}
