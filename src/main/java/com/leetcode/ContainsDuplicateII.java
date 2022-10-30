package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContainsDuplicateII {
  public static void main(String[] args) {
    System.out.println(SolutionContainsDuplicateII.containsNearbyDuplicate(new int[] { 1, 2, 3, 1, 2, 3 }, 2));
  }
}

class SolutionContainsDuplicateII {
  public static boolean containsNearbyDuplicate(int[] nums, int k) {
    List<Integer> copyList = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      copyList.add(nums[i]);
    }

    List<Integer> recordList = new ArrayList<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == nums[i + 1] && !recordList.contains(nums[i])) {
        recordList.add(nums[i]);
      }
    }
    for (int j = 0; j < recordList.size(); j++) {
      int index = copyList.indexOf(recordList.get(j));
      for (int i = copyList.indexOf(recordList.get(j)) + 1; i < copyList.size(); i++) {
        if (copyList.get(i).equals(recordList.get(j))) {
          if (Math.abs(index - i) <= k) {
            return true;
          }
          index = i;
        }
      }
    }
    return false;
  }
}