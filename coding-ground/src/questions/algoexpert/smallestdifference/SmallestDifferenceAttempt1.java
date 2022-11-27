package questions.algoexpert.smallestdifference;

import java.util.Arrays;

public class SmallestDifferenceAttempt1 {
  public static void main(String[] args) {
    int[] arrayOne = new int[] {10, 1000};
    int[] arrayTwo = new int[] {-1441, -124, -25, 1014, 1500, 660, 410, 245, 530};
    Arrays.sort(arrayOne);
    Arrays.sort(arrayTwo);
    System.out.println(Arrays.toString(arrayOne));
    System.out.println(Arrays.toString(arrayTwo));
    System.out.println(Arrays.toString(smallestDifference(arrayOne, arrayTwo)));
  }



  private static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
    Arrays.sort(arrayOne);
    Arrays.sort(arrayTwo);
    int l = 0;
    int r = 0;
    int[] ans = new int[] {arrayOne[0], arrayTwo[0]};
    int min = Math.abs(arrayOne[0] - arrayTwo[0]);

    while (l < arrayOne.length && r < arrayOne.length) {

      if (Math.abs(arrayOne[l] - arrayTwo[r]) < min) {
        ans[0] = arrayOne[l];
        ans[1] = arrayTwo[r];
        min = Math.abs(arrayOne[l] - arrayTwo[r]);
      }
      if (l + 1 >= arrayOne.length && r + 1 >= arrayTwo.length) {
        break;
      }

      if (l + 1 == arrayOne.length && r < arrayTwo.length - 1) {
        r++;
        continue;
      }
      if (r + 1 == arrayTwo.length && l < arrayOne.length - 1) {
        l++;
        continue;
      }
      if (l + 1 != arrayOne.length && r + 1 != arrayTwo.length) {
        if (Math.abs(arrayOne[l + 1] - arrayTwo[r]) < Math.abs(arrayOne[l] - arrayTwo[r + 1])) {
          l++;
        } else {
          r++;
        }
      }
      
    }
    return ans;
  }


};
