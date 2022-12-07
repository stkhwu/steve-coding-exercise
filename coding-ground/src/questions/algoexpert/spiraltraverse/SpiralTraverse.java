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
      stepN = n;
      stepM = n;
    } else {
      stepN = m;
      stepM = m - 1;
    }



    return ans;
  }

  private static List<Integer> sprialTraverseHelper(int[][] array, int horizontalSteps, int verticalSteps, int hElement,
      int VElement, int hRight, int vUp, List<Integer> target) {

    if (hRight == 1) { // horizontal travel

      for (int i = 0; i < array.length; i++) {
        
      }


    } else {

    }

    if (vUp == 1) { // vertical travel

    } else {

    }



    sprialTraverseHelper(array, horizontalSteps - 1, verticalSteps - 1, hElement - 1, VElement - 1, -1 * hRight,
        -1 * vUp);



    return new List<>();
  }
}
