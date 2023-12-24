// https://leetcode.com/problems/maximum-binary-tree/
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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums, 0, nums.length);
    }

    public TreeNode construct(int[] nums, int start, int end) {
        if (start == end) {
            return null;
        }

        int maxNo = max(nums, start, end);
        TreeNode root = new TreeNode(nums[maxNo]);
        root.left = construct(nums, start, maxNo);
        root.right = construct(nums, maxNo + 1, end);

        return root;
    }

    public int max(int[] nums, int start, int end) {
        int maxNo = start;
        for (int i = start; i < end; i++) {
            if (nums[maxNo] < nums[i]) {
                maxNo = i;
            }
        }
        return maxNo;
    }
}
