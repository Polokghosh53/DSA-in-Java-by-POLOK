// https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/
class Solution {
    public static int[] sortByBits(int[] arr){
        int[] bits = new int[arr.length];
        int[] ans = new int[arr.length];
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            int n = arr[i];
            while(n > 0){
                if((n & 1) == 1){
                    count++;
                }
                n >>= 1;
            }
            bits[i] = count;
        }
        int x = 0;
        for(int j = 0; j <= 14; j++){
            for(int k = 0; k < bits.length; k++){
                if(j == bits[k]){
                    ans[x] = arr[k];
                    x++;
                }
            }
        }
        return ans;
    }
}
