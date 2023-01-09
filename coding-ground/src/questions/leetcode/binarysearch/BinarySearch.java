package questions.leetcode.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch b = new BinarySearch();
        System.out.println(b.search(new int[]{-5, -3, 2, 13, 19}, -2));
    }

    public int search(int[] nums, int target) {

        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        int middle = leftIndex + rightIndex >>> 1;
        // 1, 2, 3, 4, 5, 8, 9
        while (leftIndex <= rightIndex) {
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
