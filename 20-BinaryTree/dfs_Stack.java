// dfs using stack
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
  public static void main(String[] args) {
    }

  void dfsStack(TreeNode node) {
    if (node == null) {
      return;
    }

    Stack<TreeNode> stack = new Stack<>();
    stack.push(node);

    while (!stack.isEmpty()) {
      TreeNode removed = stack.pop();
      System.out.print(removed.val + " ");
// since it is pre-order traversal and during remove we need to pop left node then right node 
// hence right node value is added to the stack first before left node value
      if (removed.right != null) {
        stack.push(removed.right);
      }
      if (removed.left != null) {
        stack.push(removed.left);
      }
    }
  }
}
