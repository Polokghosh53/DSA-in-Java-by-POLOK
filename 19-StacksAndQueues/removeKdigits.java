// https://leetcode.com/problems/remove-k-digits/
class Solution {
    public String removeKdigits(String num, int k) {
        if (k == num.length()) {
            return "0";
        }

        char[] digits = num.toCharArray();
        char[] stack = new char[digits.length];
        int stackTop = -1;
        int removalCount = k;

        for (int i = 0; i < digits.length; i++) {
            while(removalCount > 0 && stackTop >= 0 && stack[stackTop] > digits[i]) {
                stackTop--;
                removalCount--;
            }
            stackTop++;
            stack[stackTop] = digits[i];
        }

        int nonZeroStart = 0;

        while (stack[nonZeroStart] == '0' && nonZeroStart < digits.length - k - 1) {
            nonZeroStart++;
        }
        return String.valueOf(stack, nonZeroStart, digits.length - k - nonZeroStart);
    }
}

/*
class Solution {
    public static String removeKdigits(String num, int k) {
        
        int len = num.length();
        if (k == len){
            return "0";
        } 
        
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while (i < num.length()) {
            while (k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(i)) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
            i++;
        }
        
        while (k > 0) {
            stack.pop();
            k--;
        }
        
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse();
        
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        
        return sb.toString();
    }
}
*/
