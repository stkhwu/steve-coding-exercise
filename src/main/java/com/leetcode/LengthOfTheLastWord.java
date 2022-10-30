package com.leetcode;

public class LengthOfTheLastWord {
  public static void main(String[] args) {
    String s = "a b h j jahsd  s";
    int a = s.trim().split("[ +]")[s.trim().split("[ +]").length-1].length();
    System.out.println(a);
  }
}


