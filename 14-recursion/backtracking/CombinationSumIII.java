// https://leetcode.com/problems/combination-sum-iii/
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack3(list, new ArrayList<>(), k, n, 1);
        return list;
    }
    
    public void backtrack3(List<List<Integer>> list, List<Integer> tempList, int k, int targetRemain, int start) {
        if (tempList.size() > k) { // if list contains more than k elements, return
            return;
        }
        else if (tempList.size() == k && targetRemain == 0) {
            list.add(new ArrayList<>(tempList));
        } 
        else {
            for (int i = start; i <= 9; i++) {
                tempList.add(i);
                backtrack3(list, tempList, k, targetRemain - i, i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
