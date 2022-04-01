// https://leetcode.com/problems/reverse-string/
class Solution {
    public void reverseString(char[] s) {
        int n = s.length/2;
        int j = s.length - 1;
        for(int i = 0; i < n; i++){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            j--;
        }
        //return s;
    }
}
