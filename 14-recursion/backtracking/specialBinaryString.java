// https://leetcode.com/problems/special-binary-string/
class Solution {
    public String makeLargestSpecial(String s) {
        int count = 0, i = 0;
        if (s.length() == 0) {
            return s;
        }
        List<String> res = new ArrayList<String>();
        for (int j = 0; j < s.length(); ++j) {
            if (s.charAt(j) == '1'){
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                res.add('1' + makeLargestSpecial(s.substring(i + 1, j)) + '0');
                i = j + 1;
            }
        }
        Collections.sort(res, Collections.reverseOrder());
        return String.join("", res);
    }
}
