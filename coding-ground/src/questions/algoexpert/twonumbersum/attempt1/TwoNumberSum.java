package questions.algoexpert.twonumbersum.attempt1;

import java.util.Arrays;

public class TwoNumberSum {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(answer(new int[] { 3, 5, -4, 8, 11, 1, -1, 6 }, 10)));
  }

  static int[] answer(int[] array, int targetSum) {

    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] + array[j] == targetSum) {
          return new int[] { array[i], array[j] };
        }
      }
    }
    return new int[0];
  }
}
