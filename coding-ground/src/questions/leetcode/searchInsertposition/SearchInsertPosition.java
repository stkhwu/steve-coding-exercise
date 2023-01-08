package questions.leetcode.searchInsertposition;

public class SearchInsertPosition {

  public static void main(String[] args) {
    System.out.println(28575 >> 1); // something new
  }

  public static int searchInsertPosition(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      if (target <= nums[i]){
        return i;
      }
    }
    return nums.length;
  }
}
