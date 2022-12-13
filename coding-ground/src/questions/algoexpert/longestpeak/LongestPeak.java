package questions.algoexpert.longestpeak;

import java.util.ArrayList;
import java.util.List;

public class LongestPeak {
    public static void main(String[] args) {
        System.out.println(longestPeak(new int[]{1, 2, 3, 4, 5, 1}));
    }

    private static int longestPeak(int[] array) {
        // Write your code here.
        List<Integer> peak = new ArrayList<>();
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i - 1] < array[i] && array[i] > array[i + 1]) {
                peak.add(i);
            }
        }
        System.out.println(peak);
        int ans = 3;
        for (int p : peak) {
            int peaklength = 1;
            int r = p + 1;
            int l = p - 1;
            while (l >= 0 && array[l] < array[l + 1]) {
                peaklength++;
                l--;
            }
            while (r <= array.length - 1 && array[r] < array[r - 1]) {
                peaklength++;
                r++;
            }
            if (peaklength > ans) {
                ans = peaklength;
            }
        }
        if(peak.size()<1)
            return 0;

        return ans;
    }
}
