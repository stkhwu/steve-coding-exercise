package questions.hackerrank.stringreverse;

import java.util.Scanner;

public class StringReverse {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    /* Enter your code here. Print output to STDOUT. */
    System.out.println(Reverse.Ispalindrome(A));

  }
}

class Reverse {

  static String Ispalindrome(String s) {
    return s.equals(ReverseWord(s)) ? "Yes" : "No";
  }

  private static String ReverseWord(String s) {
    if (s.length() == 1)
      return s;
    return ReverseWord(s.substring(1, s.length())) + s.substring(0, 1);
  }
}