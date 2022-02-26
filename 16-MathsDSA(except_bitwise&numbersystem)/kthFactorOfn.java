// https://leetcode.com/problems/the-kth-factor-of-n/
// TC: O(n)
class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> factor = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                factor.add(i);
            }
        }
        if(factor.size() < k){
            return -1;
        }
        return factor.get(k - 1);
    }
}
