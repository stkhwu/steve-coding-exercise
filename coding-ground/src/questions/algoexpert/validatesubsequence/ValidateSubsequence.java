package questions.algoexpert.validatesubsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidateSubsequence {
  public static void main(String[] args) {
    List<Integer> l1 = new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10));
    List<Integer> l2 = new ArrayList<>(Arrays.asList(1, 6, -1, 10));

    System.out.println(ValidateSubsequenceSolution.isValidateSubsequence(l1, l2));
  }
}

class ValidateSubsequenceSolution {
  static boolean isValidateSubsequence(List<Integer> array, List<Integer> sequence) {
    // int pointer = 0;
    // int i = 0;
    // while (i < array.size()) {
    //   if (array.get(i).equals(sequence.get(pointer))) {
    //     i++;
    //     pointer++;
    //     if (pointer == sequence.size()) {
    //       return true;
    //     }
    //   } else {
    //     i++;
    //     if (i == array.size()) {
    //       return false;
    //     }
    //   }
    // }
    // return false;

    for (Integer e : array) {
      if (e.equals(sequence.get(0))&& !sequence.isEmpty()) {
        sequence.remove(0);
        if (sequence.isEmpty()) {
          return true;
        }
      }
    }
    return false;
  }
}