// https://leetcode.com/problems/subsets-ii/
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        
        HashSet<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        
      // Since Subsets here are, 1 << n = 1 * (2 to the power n) thats total number of subsets = 2 to the power n
        int numofSub = 1 << n;
        
        for(int i = 0; i < numofSub; i++){
            // to store subset in Child List
            List<Integer> childList = new ArrayList<>();
            
            int temp = i;
            
            for(int j = n - 1; j >= 0; j--){
                // Taking remainder. (temp & 1) is equal to (temp % 2)
                int rem = temp & 1;
                // Then dividing it by 2. (temp >> 1) is equal to (temp / 2)
                temp = temp >> 1;
                
                if(rem == 1){
                    childList.add(0, nums[j]);
                }
            }
            set.add(childList);
        }
        List<List<Integer>> ml = new ArrayList<>(set);
        
        return ml;
    }
}
