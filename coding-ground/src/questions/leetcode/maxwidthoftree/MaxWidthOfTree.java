package questions.leetcode.maxwidthoftree;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }


public class MaxWidthOfTree {

    public int widthOfBinaryTree(TreeNode root) {
        int width = 0;

        if (root.left == null) {
            widthOfBinaryTree(root.right);
            width++;
        }
        if (root.right == null) {
            widthOfBinaryTree(root.left);
        }


        return 0;
    }


    /*
    logic: find depth
    have left/right keep going

     */
}
