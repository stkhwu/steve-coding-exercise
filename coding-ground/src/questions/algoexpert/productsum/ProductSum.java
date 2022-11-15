package questions.algoexpert.productsum;


import java.util.ArrayList;
import java.util.List;

public class ProductSum {

  // Tip: You can use `element instanceof ArrayList` to check whether an item
  // is an array or an integer.
  public static int productSum(List<Object> array) {
    // Write your code here.
    return sumWithDepth(array, 1);
  }

  public static int sumWithDepth(List<Object> array, int depth) {
    int sum = 0;
    for (Object o : array) {
      if (o instanceof Integer) {
        sum = sum + (Integer) o;
      } else {
        sum = sum + sumWithDepth((ArrayList<Object>) o, depth + 1);
      }
    }
    return depth * sum;
  }

}
