// https://leetcode.com/problems/integer-to-roman/
class Solution {
    public String intToRoman(int num) {
        if(num < 1 || num > 3999){
            return "";
        }
        StringBuilder ans = new StringBuilder();
        
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        // to iterate through the number for referencing the given number in values
        int i = 0;
        
        while(num > 0){ // example: 58
            while(num >= values[i]){ // while 58 is greater than 50
                ans.append(roman[i]); // i pointing at 50, so, i in roman is L
                num -= values[i]; // 58 - 50 = 8, and it goes on
            }
            i++;
        }
        return ans.toString();
    }
}
