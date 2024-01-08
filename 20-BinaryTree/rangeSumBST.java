// https://leetcode.com/problems/range-sum-of-bst/
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
    int ans = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        if (root == null) {
            return 0;
        }

        // if (low == high && root.val == low) {
        //     return root.val;
        // }

        check(root, low, high);
        return ans;
    }

    public void check(TreeNode root, int low, int high) {
        if (root == null) {
            return;
        }
        if (root.val <= high && root.val >= low) {
            ans += root.val;
        }
        check(root.left, low, high);
        check(root.right, low, high);
    }
}
