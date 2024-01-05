// https://leetcode.com/problems/maximum-width-of-binary-tree/
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
  // creating a node to store the index & TreeNode values in order to get start and end of the index (width)
    class Node {
        TreeNode node;
        int index;
        Node(TreeNode node, int index) {
            this.node = node;
            this.index = index;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(root, 0)); // insert 0 index to start 
        int max = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            int start = 0;
            int end = 0;
            for (int i = 0; i < size; i++) {
                Node eachNode = queue.remove();
                int index = eachNode.index;
                if (i == 0) {
                    start = index;
                }
                if (i == size - 1) {
                    end = index; // reached the end
                }
                if (eachNode.node.left != null) {
                    queue.add(new Node(eachNode.node.left, 2*eachNode.index));
                }
                if (eachNode.node.right != null) {
                    queue.add(new Node(eachNode.node.right, 2*eachNode.index + 1));
                }
            }
            max = Math.max(max, end - start + 1);
        }
        return max;
    }
}
