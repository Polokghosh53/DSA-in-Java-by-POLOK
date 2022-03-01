// https://leetcode.com/problems/queries-on-number-of-points-inside-a-circle/
class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] ans = new int[queries.length];
        int i = 0;
        for(int query[] : queries){
            int a = query[0];
            int b = query[1];
            int r = query[2];
            int result = 0;
            for(int[] p : points){
                int x1 = p[0];
                int y1 = p[1];
                if(r * r >= (a - x1)*(a - x1) + (b-y1)*(b-y1)){
                    result++;
                }
            }
            ans[i++] = result;
        }
        return ans;
    }
}
