// https://leetcode.com/problems/different-ways-to-add-parentheses/
class Solution {
    public List<Integer> diffWaysToCompute(String exp) {
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (c == '-' || c == '+' || c == '*') {
                // subproblem
                String a = exp.substring(0, i);
                String b = exp.substring(i + 1);
                // backtracking to another solution if 2 or more subproblems get the same value, the result can be same but not the operation value
                List<Integer> al = diffWaysToCompute(a);
                List<Integer> bl = diffWaysToCompute(b);
                for (int x : al) {
                    for (int y : bl) {
                        if (c == '-') {
                            res.add(x - y);
                        } else if (c == '+') {
                            res.add(x + y);
                        } else if (c == '*') {
                            res.add(x * y);
                        }
                    }
                }
            }
        }
        if (res.size() == 0) {
            res.add(Integer.valueOf(exp));
        }
        return res;
    }
}
