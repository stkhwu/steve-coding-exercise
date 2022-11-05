package com.Quiz;

public class q2 {
public static void main(String[] args) {
    String ans = "DABEEABAADCEECCDAB";
  String myAns = "BABEEABAACCEECADAB";
  int j = 0;

  for (int i = 0; i < myAns.length(); i++) {
    if (myAns.charAt(i) == ans.charAt(i)) {
      j++;
    } else {
      System.out.println("Wrong ans at q" + (i+1));
    }
  }

  System.out.println(j);
}
}



// BABEEABAA  q1-9
// CCEECADAB  q10-18
