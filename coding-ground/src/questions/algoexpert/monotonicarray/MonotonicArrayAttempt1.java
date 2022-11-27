package questions.algoexpert.monotonicarray;

public class MonotonicArrayAttempt1 {
  public static void main(String[] args) {
    int[] hihi = new int[] {1, 2, 3, 4, 5, 5, 6, 7, 7};
    System.out.println(isMonotonic(hihi));
  }

  private static boolean isMonotonic(int[] array) {
    // Write your code here.
    return isDecreasing(array) || isIncreasing(array);
  }

  private static boolean isIncreasing(int[] array) {
    for (int i = 1; i < array.length; i++) {
      if (array[i] < array[i - 1]) {
        return false;
      }
    }
    return true;
  }

  private static boolean isDecreasing(int[] array) {
    for (int i = 1; i < array.length; i++) {
      if (array[i] > array[i - 1]) {
        return false;
      }
    }
    return true;
  }
}
