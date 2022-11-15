package questions.algoexpert.nodedepths;

public class NodeDepths {



  public static int nodeDepths(BinaryTree root) {
    // Write your code here.
    return nodeDepth(root, 0);
  }
  
  public static int nodeDepth(BinaryTree root, int level) {
    int total = level;
    if (root.left != null) {
      total = total + nodeDepth(root.left, level + 1);}

    if (root.right != null) {
      total = total + nodeDepth(root.right, level + 1);
    }
    
    return total;
  }


  static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
      left = null;
      right = null;
    }
  }

}
