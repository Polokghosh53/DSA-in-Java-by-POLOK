//  Objective: find the path to be as same the array mentioned
// Example: arr = [3, 9, 12, 8]
/*
      (3)
  (5)    (9)
       (10)  (12)
    (16)   (8)
*/
public class findPath {
    public static void main(String[] args) {
        
    }

    public class TreeNode {
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

    boolean findPath(TreeNode node, int[] arr) {
        if (node == null) {
            return arr.length == 0;
        }
        return helper(node, arr, 0);
    }

    boolean helper(TreeNode node, int[] arr, int index) {
        if (node == null) {
            return false;
        }

        if (index > arr.length || node.val != arr[index]) {
            return false;
        }

        if (node.left == null && node.right == null && index == arr.length - 1) {
            return true;
        }

        return helper(node.left, arr, index + 1) || helper(node.right, arr, index + 1);
    }

}
