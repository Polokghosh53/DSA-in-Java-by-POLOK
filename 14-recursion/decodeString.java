// https://leetcode.com/problems/decode-string/
class Solution {
    int i = 0;
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        String temp_s = "";
        
        while(i < s.length()) {
            char c = s.charAt(i);
            i++;
            
            if (c == '[') {
                temp_s = decodeString(s);
                for (int j = 0; j < count; j++) {
                    sb.append(temp_s);
                } 
                count = 0;
            } else if (c == ']') {
                break;
            } else if (Character.isAlphabetic(c)) {
                sb.append(c);
            } else {
                count = count * 10 + c - '0';
            }
        }
        return sb.toString();
    }
}
