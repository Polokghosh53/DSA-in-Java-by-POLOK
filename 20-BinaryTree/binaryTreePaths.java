// https://leetcode.com/problems/binary-tree-paths/
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        dfs(root, "", result);
        return result;
    }

    public void dfs(TreeNode root, String path, List<String> result) {
        if (root == null) {
            return;
        }
        path += root.val;

        if (root.left == null && root.right == null) {
            result.add(path);
        } else {
            path += "->";
            dfs(root.left, path, result);
            dfs(root.right, path, result);
        }
    }
}
