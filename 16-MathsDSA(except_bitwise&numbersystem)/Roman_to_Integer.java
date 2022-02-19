// https://leetcode.com/problems/roman-to-integer/
class Solution {
    public int romanToInt(String s) {
        // taking the value of the last character ROMAN NUMBER in default, for example: MCMXCIV where V is the last ROMAN NUmber
        int result = getVal(s.charAt(s.length() - 1));
        // starting loop from 2nd last ROMAN NUMBER, that is, I
        for(int i = s.length() - 2; i >= 0; i--){
            // compare 2nd last ROMAN NUMBER with LAST NUMBER, 2nd last: I and last: V if I: 1 is less than V: 5 then result: 5 is 5 - 1 = 4
            if(getVal(s.charAt(i)) < getVal(s.charAt(i + 1))){
                result -= getVal(s.charAt(i));
            }
            else{
                result += getVal(s.charAt(i));
            }
        }
        return result;
    }
    
    private int getVal(char c){
        switch(c){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }
}
