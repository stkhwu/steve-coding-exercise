package com.algoexpert;

import java.util.Arrays;
import java.util.Collections;

public class TandemBicycle {
  public static void main(String[] args) {
    int[] a = new int[] { 3,3,4,6,1,2 };
    int[] b = new int[] { 1,2,1,9,12,3 };
    System.out.println(tandemBicycle(a, b, false));
  }
  // 9 1, 5 2, 7 2, 6 3, 5 3
  // 9 7, 6 5, 5 3, 3 2, 2 1

  // 12 6, 9 4, 3 3, 3 2, 2 1, 1 1

  public static int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
    // Write your code here.
    int[] sortedCombinedArray = new int[redShirtSpeeds.length + blueShirtSpeeds.length];
    int i = 0, r = 0, b = 0;
    Arrays.sort(redShirtSpeeds);
    Arrays.sort(blueShirtSpeeds);
    while (i < sortedCombinedArray.length) {
      if (redShirtSpeeds[r]<blueShirtSpeeds[b]) {
        sortedCombinedArray[i] = redShirtSpeeds[r++];
        i++;
        sortedCombinedArray[i++] = blueShirtSpeeds[b++];
      } else {
        sortedCombinedArray[i] = blueShirtSpeeds[b++];
        i++;
        sortedCombinedArray[i++] = redShirtSpeeds[r++];

      }
    }
    i = 0;
    
  
    
    System.out.println(Arrays.toString(sortedCombinedArray));
    if (!fastest) {
      int j = 0;
      if(sortedCombinedArray[0]<=sortedCombinedArray[1]){
        j = 1;
      } 
      
      for (; j < sortedCombinedArray.length; j = j + 2) {
        i = i + sortedCombinedArray[j];
      }
    } else {
      Arrays.sort(sortedCombinedArray);
      for (int j = sortedCombinedArray.length / 2; j < sortedCombinedArray.length; j++) {
        i = i + sortedCombinedArray[j];
      }
    }
    return i;
  }
}
