package exercise;

public class BinarySearch {

    public static int binarySearch(int[] array, int target) {
        int l = 0;
        int r = array.length - 1;
        int m = (l + r) / 2;

        while (l < m) {
            if (target < array[m]) {
                r = m - 1;
                m = (l + r) / 2;
            } else if (target > array[m]) {
                l = m + 1;
                m = (l + r) / 2;
            } else {
                return m;
            }
        }

        return -1;
    }
}
