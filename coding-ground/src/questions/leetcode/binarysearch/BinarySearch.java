package questions.leetcode.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int b = 1;
        int a = 0;

        System.out.println(a + b - 1 >>> 1);
    }

    public int search(int[] nums, int target) {

        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        int middle = leftIndex + rightIndex >>> 1;
        // 1, 2, 3, 4, 5, 8, 9
        while (leftIndex <= middle || rightIndex >= middle) {
            if (nums[middle] == target) {
                return middle;
            }
            if (target < nums[middle]) {
                rightIndex = middle - 1;
            } else {
                leftIndex = middle + 1;
            }
            middle = leftIndex + rightIndex >>> 1;
        }
        return -1;
    }
}
