// https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/
class Solution {
    public int countPrimeSetBits(int left, int right) {
        boolean [] primes = new boolean[]{false, false, true, true, false, true, false, true, false, false , false, true, false, true, false, false, false, true, false, true, false};
        int count = 0;
        for(int i = left; i <= right; i++){
            if(primes[CountBits(i)]) count++;
        }
        return count;
    }
    
    public int CountBits(int n){
        int count = 0;
        while(n > 0){
            n = (n & (n - 1));
            count++;
        }
        return count;
    }
}
