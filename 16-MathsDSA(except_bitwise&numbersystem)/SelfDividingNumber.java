// https://leetcode.com/problems/self-dividing-numbers/ 
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = left; i <= right; i++){
            if(divideNumber(i)){
                list.add(i);
            }
        }
        return list;
    }
    
    private boolean divideNumber(int n){
        int temp = n;
        while(n != 0){
            int rem = n % 10;
            // return false if the one of the digit from the number is 0 
            // or when it does not divide properly to give 0
            if(rem == 0 || temp % rem != 0){
                return false;
            }
            n = n / 10;
        }
        return true;
    }
}
