package questions.algoexpert.findvlosestvalueInbst;

public class FindClosestValueInBST {
  public static void main(String[] args) {

  }

  public static int findClosestValueInBst(BST tree, int target) {
    // Write your code here.
    if (target == tree.value ||
        (tree.right != null && tree.right.value + tree.value < 2 * target) ||
        (tree.left != null && tree.left.value + tree.value < 2 * target)) {
      return tree.value;
    }

    if (target > tree.value && tree.right != null) {
      if (Math.abs(target - tree.value) < Math.abs(target - tree.right.value)) {
        return tree.value;
      }
      return findClosestValueInBst(tree.right, target);
    }
    if (target < tree.value && tree.left != null) {
      if (Math.abs(target - tree.value) < Math.abs(target - tree.left.value)) {
        return tree.value;
      }
      return findClosestValueInBst(tree.left, target);
    }
    return tree.value;
  }

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
}