package questions.leetcode.runningsumof1darray.attempt1;

public class RunningSumOf1dArray {

    public int[] runningSum(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
