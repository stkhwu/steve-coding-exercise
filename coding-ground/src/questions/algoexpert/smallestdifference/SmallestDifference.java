package questions.algoexpert.smallestdifference;

import java.util.Arrays;

public class SmallestDifference {
  public static void main(String[] args) {
    int[] arrayOne = new int[] {-1, 5, 10, 20, 28, 3};
    int[] arrayTwo = new int[] {26, 134, 135, 15, 17};
    Arrays.sort(arrayOne);
    Arrays.sort(arrayTwo);
    System.out.println(Arrays.toString(arrayOne));
    System.out.println(Arrays.toString(arrayTwo));
    System.out.println(Arrays.toString(smallestDifference(arrayOne, arrayTwo)));
  }



  private static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
    Arrays.sort(arrayOne);
    Arrays.sort(arrayTwo);
    int arrayOnePointer = 0;
    int arrayTwoPointer = 0;
    int[] ans = new int[2];
    int min = Math.abs(arrayOne[arrayOnePointer] - arrayTwo[arrayTwoPointer]);

    while (arrayOnePointer < arrayOne.length || arrayTwoPointer < arrayTwo.length) {

      if (Math.abs(arrayOne[arrayOnePointer] - arrayTwo[arrayTwoPointer]) < min) {
        ans[0] = arrayOne[arrayOnePointer];
        ans[1] = arrayTwo[arrayTwoPointer];
        min = Math.abs(arrayOne[arrayOnePointer] - arrayTwo[arrayTwoPointer]);
      }

      if (arrayOnePointer < arrayOne.length - 1 && arrayOne[arrayOnePointer] < arrayTwo[arrayTwoPointer]) {
        arrayOnePointer++;
      } else if ((arrayTwoPointer < arrayTwo.length - 1 && arrayOne[arrayOnePointer] > arrayTwo[arrayTwoPointer])) {
        arrayTwoPointer++;
      } else {
        return ans;
      }
    }
    return ans;
  }
}
