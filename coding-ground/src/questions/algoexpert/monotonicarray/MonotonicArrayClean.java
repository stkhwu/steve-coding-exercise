package questions.algoexpert.monotonicarray;

public class MonotonicArrayClean {



  private static boolean isMonotonic(int[] array) {
    // Write your code here.
    boolean isIncreasing = true;
    boolean isDecreasing = true;

    for (int i = 1; i < array.length; i++) {
      if (array[i] > array[i - 1]) {
        isDecreasing = false;
      } else if (array[i] < array[i - 1]) {
        isIncreasing = false;
      }
    }

    return isIncreasing || isDecreasing;
  }
}
