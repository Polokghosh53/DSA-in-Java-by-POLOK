// https://practice.geeksforgeeks.org/problems/handshakes1303/1/
class Solution{
    static int count(int N) 
    { 
        if (N == 0) return 1;
        
        int ans = 0;
      // for every handshake the table is divided into 2 halfs
        for (int i = 0; i < N; i+=2) {
            ans += count(i)*count(N - i - 2);
        }
        return ans;
    }
};
