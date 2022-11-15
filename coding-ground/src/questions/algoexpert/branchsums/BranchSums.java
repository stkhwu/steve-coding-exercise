package questions.algoexpert.branchsums;

import java.util.ArrayList;
import java.util.List;

public class BranchSums {
  public static void main(String[] args) {

  }

  // This is the class of the input root. Do not edit it.
  public static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }

  public static List<Integer> branchSums(BinaryTree root) {
    // Write your code here.
    List<Integer> list = new ArrayList<>();
    branchSums2(root, list, 0);
    return list;
  }

  public static void branchSums2(BinaryTree root, List<Integer> list, int sum) {

    if (root.left != null) {
      branchSums2(root.left, list, sum + root.value);
    }

    if (root.right != null) {
      branchSums2(root.right, list, sum + root.value);
    }

    if (root.left == null && root.right == null) {
      list.add(sum + root.value);
    }
  }

}
