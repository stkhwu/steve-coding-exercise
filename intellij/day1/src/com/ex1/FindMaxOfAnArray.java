package com.ex1;

import java.util.Arrays;

public class FindMaxOfAnArray {
    public static int find(int[] array) {
        int max = array[0];
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println(max);

        // max = Arrays.stream(array).max().getAsInt();
        return max;
    }
}
