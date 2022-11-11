package com.algoexpert;

public class PalindromeCheck {
  public static void main(String[] args) {
    System.out.println(reverseString("abcde"));
  }
  
  public static boolean isPalindrome(String str) {
    // Write your code here.
    return str.equals(reverseString(str));
  }

  public static String reverseString(String initial) {
    if ("".equals(initial)) {return "";}
    return initial.substring(initial.length()-1,initial.length()) + reverseString(initial.substring(0,initial.length()-1));
  }
}
