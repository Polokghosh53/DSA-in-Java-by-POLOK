// https://leetcode.com/problems/3sum-with-multiplicity/
class Solution {
    public int threeSumMulti(int[] arr, int target) {
        // create a frequency map
        long[] nmap = new long[101];
        long ans = 0;
        for(int num : arr) nmap[num]++;
        for(int k = 100; k >= 0; k--){
            for(int j = k; j >= 0; j--){
                int i = target - k - j;
                if(i > j || i < 0) continue;
                long x = nmap[i], y = nmap[j], z = nmap[k], res = x * y * z;
                if(res == 0) continue;
                if(i == k) res = x * (x - 1) * (x - 2) / 6;
                else if(i == j) res = x * (x - 1) / 2 * z;
                else if(j == k) res = x * y * (y - 1) / 2;
                ans += res;
            }
        }
        return (int)(ans % 1000000007);
    }
}
