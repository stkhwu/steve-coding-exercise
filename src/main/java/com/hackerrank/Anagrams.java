package com.hackerrank;

public class Anagrams {
  public static void main(String[] args) {
    System.out.println(isAnagram("anagram", "margana"));
  }

  static boolean isAnagram(String a, String b) {
    // Complete the function
    if (a.length() != b.length()) {
      return false;
    }
    int counter1 = 0;
    int counter2 = 0;
    int counter3 = 0;
    for (int i = 0; i < a.length(); i++) {
      for (int j = 0; j < b.length(); j++) {

        if (a.toLowerCase().charAt(i) == a.toLowerCase().charAt(j)) {
          counter1++;
          
        }

        if (b.toLowerCase().charAt(i) == b.toLowerCase().charAt(j)) {
          counter2++;
          
        }

        if (a.toLowerCase().charAt(i) == b.toLowerCase().charAt(j)) {
          counter3++;
        }
      }
      
      if (counter3 == 0) {
        return false;
      }
    }

    if (!(counter1 != 0 && counter1 == counter2)) {
      return false;
    }

    return true;

  }
}
