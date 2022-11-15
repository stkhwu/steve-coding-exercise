package questions.leetcode.searchInsertposition;

public class SearchInsertPosition {
  public static void main(String[] args) {

  }
}

class SolutionSearchInsertPosition {
  public static int searchInsertPosition(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      if (target < nums[0]){
        return 0;
      }
      if (nums[i] == target) {
        return i;
      }
      if (i != 0 && nums[i] > target && nums[i - 1] < target) {
        return i;
      }
    }
    return nums.length;
  }
}