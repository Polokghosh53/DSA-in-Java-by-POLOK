// https://leetcode.com/problems/last-stone-weight/
class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < stones.length; i++){
            arr.add(stones[i]);
        }
        
        while(arr.size() > 1){
            Collections.sort(arr);
            // get the value of y and x and then remove them from the array
            // for adding the value of (y - x ) instead of y and x values
            int y = arr.get(arr.size() - 1);
            arr.remove(new Integer(y));
            
            // same size of x because y value gets removed
            int x = arr.get(arr.size() - 1);
            arr.remove(new Integer(x));
            
            if(x != y){
                arr.add(y - x);
            }
            
        }
        
        if(arr.isEmpty()){
            return 0;
        }
        else{
            return arr.get(0);
        }
    }
}
