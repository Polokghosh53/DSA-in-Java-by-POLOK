// https://leetcode.com/problems/restore-ip-addresses/
class Solution {
    List<String> ans = new ArrayList<>();
    String str;
    public List<String> restoreIpAddresses(String s) {        
        str = s;
        helper("", 0, 0);
        
        return ans;
    }
    
    void helper(String path, int index, int dots) {
        if (dots > 4) {
            return;
        }
        if (dots == 4 && index >= str.length()) {
            ans.add(path.substring(0, path.length() - 1));
            return;
        }
        
        for (int length = 1; length <= 3 && index + length <= str.length(); length++) {
            String num = str.substring(index, index + length);
            if (num.charAt(0) == '0' && length != 1) {
                break;
            }
          // should be in the range of (0, 255) for IP address
            else if (Integer.parseInt(num) <= 255) {
                helper(path + str.substring(index, index + length) + ".", index + length, dots + 1);
            }
        }
    }
}
