package questions.algoexpert.threenumbersum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSumAttempt1 {
  public static void main(String[] args) {
    List<Integer[]> e = threeNumberSum(new int[] {12, 3, 1, 2, -6, 5, -8, 6}, 8);
    e.forEach(a -> System.out.println(Arrays.toString(a)));
  }

  static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
    List<Integer[]> ans = new ArrayList<>();
    Arrays.sort(array);
    int left = 0;
    int right = array.length - 1;

    for (int i = 1; i < array.length - 2; i++) {
      while (left < i - 1 || right > i + 1) {
        System.out.println(left + "" + i + "" + right);
        if (array[left] + array[i] + array[right] == targetSum) {
          Integer[] temp = new Integer[3];
          temp[0] = array[left];
          temp[1] = array[i];
          temp[2] = array[right];
          ans.add(temp);
          System.out.println("+++"+Arrays.toString(temp));
          System.out.println("added");
        }

        if (left < i - 1 && right == i + 1) {
          left++;
          right = array.length - 1;
        }
        if (right > i + 1) {
          right--;
        }
      }
      left = 0;
      right = array.length - 1;
    }
    return ans;
  }
}
