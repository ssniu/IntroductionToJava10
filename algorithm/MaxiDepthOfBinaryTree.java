/**
 * 104 Maximum depth of binary tree
 * Given a binary tree, find its maximum depth.

 * The maximum depth is the number of nodes along the
 * longest path from the root node down to the farthest leaf node.
 *
 */

public class MaxiDepthOfBinaryTree{
  public static void main(String[] args){

  }

  public static int maxDepthOfBinaryTree(TreeNode root){
    if(root == null){
      return 0;
    }
    return 1 + Math.max(maxDepthOfBinaryTree(root.left), maxDepthOfBinaryTree(root.right));
  }
}
