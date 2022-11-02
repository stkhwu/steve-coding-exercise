package com.algoexpert;

import java.util.Arrays;
import java.util.List;

public class SortedSquaredArray {
  public static void main(String[] args) {
    var input = new int[] { 1, 2, 3, 5, 6, 8, 9 };
    System.out.println(Arrays.toString(sortedSquaredArray(input)));
  }
  
  public static int[] sortedSquaredArray(int[] array) {
    // Write your code here.
    return Arrays.stream(array).map(e -> e * e).sorted().toArray();
    }


  // static int[] square(int[] array) {
  //   for (int i = 0; i < array.length; i++) {
  //     array[i] = array[i] * array[i];
  //   }
  //   Arrays.sort(array);
  //   return array;
  // }
}
