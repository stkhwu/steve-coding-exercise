package com.algoexpert;

public class NthFibonacci {
public static void main(String[] args) {
  System.out.println(getNthFib(30));
}

  public static int getNthFib(int n) {
    // Write your code here.
    if (n == 0) {
      return 0;
    }

    if (n == 1) {
      return 0;
    }

    if (n == 2) {
      return 1;
    }
      

    return getNthFib(n-1) + getNthFib(n-2);
  }
}
