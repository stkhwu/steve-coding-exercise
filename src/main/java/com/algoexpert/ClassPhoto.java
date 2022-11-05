package com.algoexpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ClassPhoto {
  public boolean classPhotos(
      ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
    // Write your code here.
    ArrayList<Integer> taller;
    ArrayList<Integer> shorter;
    Collections.sort(redShirtHeights);
    Collections.sort(blueShirtHeights);
    if (redShirtHeights.get(0) > blueShirtHeights.get(0)) {
      taller = redShirtHeights;
      shorter = blueShirtHeights;
    } else {
      taller = blueShirtHeights;
      shorter = redShirtHeights;
    }
    
    for (int i = 0; i < redShirtHeights.size(); i++) {
      if (taller.get(i) <= shorter.get(i)) {
        return false;
      }
    }
    return true;
  }
}
