package com.algoexpert;

public class BinarySearch {
  public static void main(String[] args) {
    int[] test = new int[] { 1, 1, 3, 4, 5, 7, 8, 12, 13, 13, 13, 22, 23, 34, 44, 45, 111 };
    System.out.println(binarySearch(test, 22));
  }

  public static int binarySearch(int[] array, int target) {
    int l = 0;
    int r = array.length - 1;
    int m = (l + r) / 2;

    while (l <= r) {
      if (target < array[m]) {
        r = m - 1;
      } else if (target > array[m]) {
        l = m + 1;
      } else if (target == array[m]) {
        return m;
      }
      m = (l + r) / 2;
    }

    return -1;
  }
}
