// https://leetcode.com/problems/binary-tree-tilt/
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
    int count;
    public int findTilt(TreeNode root) {
        count = 0;
        helper(root);
        return count;
    }

    public int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = helper(root.left);
        int right = helper(root.right);
        int tilt = Math.abs(left - right);

        count = count + tilt;

        return root.val + left + right;
    }
}
