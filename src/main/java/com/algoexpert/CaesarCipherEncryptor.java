package com.algoexpert;

public class CaesarCipherEncryptor {
  public static void main(String[] args) {
    System.out.println(caesarCypherEncryptor("abc", 1));
  }

  public static String caesarCypherEncryptor(String str, int key) {
    // Write your code here.
    char[] temp = str.toCharArray();
    for (int i = 0; i < temp.length; i++) {
      temp[i] = (char) ((temp[i] + key - 97) % 26 + 97);
    }

    return String.valueOf(temp);
  }
}
