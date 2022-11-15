package questions.algoexpert.minimumwaitingtime;

import java.util.Arrays;

public class MinimumWaitingTime {

  public static void main(String[] args) {
    int[] arr = new int[] { 3, 2, 1, 2, 6};
    System.out.println(minimumWaitingTime(arr));
  }

  public static int minimumWaitingTime(int[] queries) {
    // Write your code here.
    int sum = 0;
    Arrays.sort(queries);
    for (int i = 0; i < queries.length; i++) {
      for (int j = 0; j < i; j++) {
        sum = sum + queries[j];
      }
    }

    return sum;
  }
}
