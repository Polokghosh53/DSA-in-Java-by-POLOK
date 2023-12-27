// https://leetcode.com/problems/binary-tree-cameras/
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
    public int minCameraCover(TreeNode root) {
        return dfs(root) > 2 ? count + 1 : count;
    }

    public int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int val = dfs(node.left) + dfs(node.right);
        if (val == 0) {
            return 3;
        }

        if (val < 3) {
            return 0;
        }
        count++;
        return 1;
    }
}
