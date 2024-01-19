// https://leetcode.com/problems/longest-univalue-path/
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
    int count = 0;
    public int longestUnivaluePath(TreeNode root) {
        helper(root);
        return count;
    }

    public int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = helper(root.left);
        int right = helper(root.right);

      // left and right tree variables are used to add to take count of the longest path 
      // and then consider the big value to return
        int TreeLeft = 0;
        int TreeRight = 0;

        if (root.left != null && root.left.val == root.val) {
            TreeLeft += left + 1;
        }

        if (root.right != null && root.right.val == root.val) {
            TreeRight += right + 1;
        }

        count = Math.max(count, TreeLeft + TreeRight);

        return Math.max(TreeLeft, TreeRight);
    }
}
