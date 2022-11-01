package com.leetcode;

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class AddBinary {
  public static void main(String[] args) {
    String a = "1111";
    String b = "1111";
    System.out.println(SolutionAddBinary.addBinary(a, b));
  }
}

class SolutionAddBinary {

  static String addBinary(String a, String b) {
    String temp;
    if (a.length() < b.length()) {
      temp = a;
      a = b;
      b = temp;
    }

    int[] aInt = new int[a.length()];
    for (int i = 0; i < aInt.length; i++) {
      aInt[i] = Character.getNumericValue(a.charAt(i));
    }
    System.out.println(Arrays.toString(aInt));

    int[] bInt = new int[b.length()];
    for (int i = 0; i < bInt.length; i++) {
      bInt[i] = Character.getNumericValue(b.charAt(i));
    }
    System.out.println(Arrays.toString(bInt));

    int[] combinedInt = new int[aInt.length + 1];
    for (int i = aInt.length - 1; i > -1; i--) {
      if (i > aInt.length - bInt.length - 1) {
        combinedInt[i + 1] = aInt[i] + bInt[i - aInt.length + bInt.length];
      } else {
        combinedInt[i + 1] = aInt[i];
      }
    }
    System.out.println(Arrays.toString(combinedInt));

    for (int i = combinedInt.length - 1; i > 0; i--) {
      if (combinedInt[i] > 1) {
        combinedInt[i - 1] = combinedInt[i - 1] + combinedInt[i] / 2;
        combinedInt[i] = combinedInt[i] % 2;
      }
    }
    System.out.println(Arrays.toString(combinedInt));
    a = "";
    for (int i = 0; i < combinedInt.length; i++) {
      a = a + combinedInt[i];
    }
    System.out.println(a);
    if (a.charAt(0) == '0') {
      a = a.substring(1, a.length());
    }
    return a;

   
  }
}