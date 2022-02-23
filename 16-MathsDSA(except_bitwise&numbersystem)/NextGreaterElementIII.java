class Solution {
    public int nextGreaterElement(int n) {
        String s = Integer.toString(n);
        int[] arr = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            arr[i] = (int)(s.charAt(i) - '0');
        }
        
        int pivot = arr.length - 2;
        while(pivot >= 0 && arr[pivot] >= arr[pivot + 1]){
            pivot--;
        }
        if(pivot == -1) return -1;
        
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] > arr[pivot]){
                int temp = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = temp;
                break;
            }
        }
        Arrays.sort(arr, pivot + 1, arr.length);
        long res = 0;
        for(int i = 0; i < arr.length; i++){
            res *= 10;
            res += arr[i];
        }
      // a check whether the returned integer fits in 32-bit integer
        return res > Integer.MAX_VALUE ? -1 : (int) res;
    }
}
