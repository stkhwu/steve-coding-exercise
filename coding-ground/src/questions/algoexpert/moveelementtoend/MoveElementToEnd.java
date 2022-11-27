package questions.algoexpert.moveelementtoend;

import java.util.List;

public class MoveElementToEnd {



  private static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
    // Write your code here.
    int counter = 0;
    while (array.contains(toMove)) {
      array.remove(array.indexOf(toMove));
      counter++;
    }
    while (counter > 0) {
      array.add(toMove);
      counter--;
    }
      return array;
  }
}
