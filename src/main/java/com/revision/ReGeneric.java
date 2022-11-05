package com.revision;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReGeneric {
  

  public static <T> List<T> fromArraytoList(T[] a) {
    return Arrays.stream(a).collect(Collectors.toList());
  }


  public static void main(String[] args) {
    Integer[] intArray = { 1, 2, 3 };
    List<Integer> intList = ReGeneric.fromArraytoList(intArray);

  }
}
