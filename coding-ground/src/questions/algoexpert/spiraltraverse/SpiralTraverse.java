package questions.algoexpert.spiraltraverse;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {

  public static void main(String[] args) {

    spiralTraverse(new int[5][2]);
  }

  private static List<Integer> spiralTraverse(int[][] array) {
    // Write your code here.
    List<Integer> ans = new ArrayList<>();
    int n = array.length;
    int m = array[array.length - 1].length;
    int stepN = 0;
    int stepM = 0;


    if (n < m) {
      stepN = n - 1;
      stepM = n;
    } else {
      stepN = m - 1;
      stepM = m - 1;
    }

    for (int i = 0; i < array.length; i++) {
      ans.add(array[0][i]);
    }

    for (int i = 0; i < stepM; i++) {


      for (int j = m - i; j > 0; j--) { // vertical operation

        if (i % 2 == 0) {
          ans.add(array[n - i / 2 - 1][m - i / 2 - j]); // down
        } else {
          ans.add(array[i / 2][j + i / 2]); // up
        }

      }

      for (int j = 0; j < array.length; j++) { // horizontal opertaion

      }



    }

    return ans;
  }
}
