package questions.leetcode.findpivotindex;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {

        int leftSum = 0;
        int rightSum = 0;
        for (int i = 1; i < nums.length; i++) {
            rightSum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == rightSum) {
                return i;
            }
            if (i == nums.length - 1) continue;
            leftSum += nums[i];
            rightSum -= nums[i + 1];
        }
        return -1;
    }

    public static void main(String[] args) {
        FindPivotIndex a = new FindPivotIndex();
        System.out.println(a.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }
}
