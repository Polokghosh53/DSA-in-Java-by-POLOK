// https://leetcode.com/problems/number-complement/
class Solution {
    public int findComplement(int num) {
        int toBits = (int)(Math.log(num)/Math.log(2)) + 1;
        int mask = (1 << toBits) - 1;
        return ~num & mask;
    }
}
