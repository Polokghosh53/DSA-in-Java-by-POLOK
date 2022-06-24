https://leetcode.com/problems/k-th-symbol-in-grammar/

// TC: O(2^N)
// SC: O(N)
class Solution {
    public int kthGrammar(int n, int k) {
        // base case
        if (n == 1) {
            return 0;
        }
        // calculating the length of the rows and finding out the following
        // if K lies in the first half of the length, it is as same as the previous row
        if (k % 2 == 0) {
            if (kthGrammar(n - 1, k / 2) == 0) {
                return 1;
            } else {
                return 0;
            }
            // if K does not lie in the first half, the second half returns the complement of the previous row
        } else {
            if (kthGrammar(n - 1, (k + 1) / 2) == 0) {
                return 0;
            } else {
                return 1;
            }
        }
    }
}

// think of the problem like this
/*        0
      /       \
     0          1
   /   \      /    \
   0     1    1      0
 / \     / \   / \   / \
 0  1   1   0  1  0  0  1
*/
