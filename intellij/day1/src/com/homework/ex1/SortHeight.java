package com.homework.ex1;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortHeight {

    public static String[] getTallest(String[] names, int[] heights) {
        SortedMap<Integer, String> sortedMap = new TreeMap<>();
        for (int i = 0; i < heights.length; i++) {
            sortedMap.put(heights[i], names[i]);
        }
        int i = names.length;
        String[] results = new String[i];
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            results[--i] = entry.getValue();
        }
        return results;
    }
}
