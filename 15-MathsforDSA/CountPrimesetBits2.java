// https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/
class Solution {
    public int countPrimeSetBits(int left, int right) {
        // { 2, 3, 5, 7, 11, 13, 17, 19 }th bits are 1s
    // (10100010100010101100)2 = (665772)10
        // O(R - L + 1)
        int magic = 665772;
        int ans = 0;
        
        for(int n = left; n <= right; n++){
            if((magic & (1 << Integer.bitCount(n))) > 0)
                ++ans;
        }
        return ans;
    }
}
