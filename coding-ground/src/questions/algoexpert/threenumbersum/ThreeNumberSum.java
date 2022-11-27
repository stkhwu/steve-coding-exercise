package questions.algoexpert.threenumbersum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {
  public static void main(String[] args) {
    List<Integer[]> e = threeNumberSum(new int[] {12, 3, 1, 2, -6, 5, -8, 6}, 8);
    e.forEach(a -> System.out.println(Arrays.toString(a)));
  }

  private static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
    List<Integer[]> ans = new ArrayList<>();
    Arrays.sort(array);

    for (int i = 0; i < array.length; i++) {
      int left = i + 1;
      int right = array.length - 1;

      while (left < right) {
        int sum = array[left] + array[i] + array[right];
        if (sum == targetSum) {
          Integer[] temp = new Integer[3];
          temp[0] = array[i];
          temp[1] = array[left++];
          temp[2] = array[right--];
          ans.add(temp);
        } else if (sum > targetSum) {
          right--;
        } else {
          left++;
        }
      }
    }
    return ans;
  }
}
