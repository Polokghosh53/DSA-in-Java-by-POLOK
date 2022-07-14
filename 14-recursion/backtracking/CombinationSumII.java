// https://leetcode.com/problems/combination-sum-ii/
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack2(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }
    
    public void backtrack2(List<List<Integer>> list, List<Integer> tempList, int[] nums, int targetRemain, int start) {
        if (targetRemain < 0) {
            return;
        }
        
        else if (targetRemain == 0) {
            list.add(new ArrayList<>(tempList));
        }
        
        else {
            for (int i = start; i < nums.length; i++) {
                if (i > start && nums[i] == nums[i - 1]) continue; // skipping duplicates
                tempList.add(nums[i]);
                backtrack2(list, tempList, nums, targetRemain - nums[i], i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
