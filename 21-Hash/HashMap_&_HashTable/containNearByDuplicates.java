// https://leetcode.com/problems/contains-duplicate-ii/
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length < 2 || k == 0) {
            return false;
        }

        int i = 0;

        HashSet<Integer> hash = new HashSet<Integer>();
        for (int j = 0; j < nums.length; j++) {
            if (!hash.add(nums[j])) {
                return true;
            }

            if (hash.size() >= k + 1) {
                hash.remove(nums[i++]);
            }
        }
        return false;
    }
}
