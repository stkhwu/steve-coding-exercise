package com.algoexpert;

import java.util.Arrays;

public class FirstNonRepeatingCharacter {
  public static void main(String[] args) {
    System.out.println(firstNonRepeatingCharacter("abcdcaf"));
  }



  public static int firstNonRepeatingCharacter(String string) {
    // Write your code here.
    for (int i = 0; i < string.length(); i++) {
      if (string.indexOf(string.charAt(i)) == string.lastIndexOf(string.charAt(i))) {
        return i;
      }
    }
    return -1;
  }
}
