// https://leetcode.com/problems/multiply-strings/
class Solution {
    public String multiply(String nums1, String nums2) {
        if(nums1.equals("0") || nums2.equals("0")){
            return "0";
        }
        if(nums1.equals("1")) return nums2;
        if(nums2.equals("1")) return nums1;
        
        int arr[] = new int[nums1.length() + nums2.length()];
        
        for(int i = nums1.length() - 1; i >= 0; i--){
            for(int j = nums2.length() - 1; j >= 0; j--){
                int mul = (nums1.charAt(i) - '0')*(nums2.charAt(j)-'0');
                mul += arr[i + j + 1];
                
                arr[i + j + 1] = mul % 10;
                arr[i + j] += mul / 10;
            }
        }
        
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            if(ans.length() == 0 && arr[i] == 0) continue;
            ans.append(arr[i]);
        }
        return ans.toString();
    }
}
