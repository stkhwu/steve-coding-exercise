package com.algoexpert;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class NonConstructibleChange {
  public static void main(String[] args) {

  }
}

class NonConstructibleChangeSolution {

  static int nonConstructibleChange(int[] coins) {
    Arrays.sort(coins);
    int allPossible = 0;

    for (int i = 0; i < coins.length; i++) {
      if (coins[i] > allPossible + 1) {
        return allPossible + 1;
      } else {
        allPossible = allPossible + coins[i];
      }
    }

    return allPossible + 1;
  }
}