import java.util.*;

public class Main
{
    public static void main(String[] args) {
        int[] nums = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(nums, target));
    }
    
  // https://leetcode.com/problems/combination-sum/
  
  // remove static before using it in LeetCode
	public static List<List<Integer>> combinationSum(int[] nums, int target) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums); //  setting the nums list in order for sum
		backtrack(list, new ArrayList<>(), nums, target, 0);
		return list;
	}
	
	// create a list to store lists (tempList) with remaining target for for looping with start index 0
	static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int targetRemain, int start) {
	    if (targetRemain < 0) {
	        return;
	    }
	    
	    else if (targetRemain == 0) {
	        list.add(new ArrayList<>(tempList));
	    }
	    
	    else {
	        for (int i = start; i < nums.length; i++) {
	            tempList.add(nums[i]); // add an element that will be added to find the sum
	            backtrack(list, tempList, nums, targetRemain - nums[i], i); // not i + 1 because we can reuse the same elements
	            // backtrack for that number for checking all other combination sum
	            tempList.remove(tempList.size() - 1); 
	        }
	    }
	}
}
