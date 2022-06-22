public static void main(String[] args) {
		int[] arr = { 20, 23, 23, 45, 78, 88 };
        int n = arr.length;
        System.out.println(checkSorting(arr, n));
	}
	
	public static int checkSorting(int[] arr, int n) {
	    if (n == 0 || n == 1) {
	        return 1;
	    }
	    
	    if (arr[n - 1] < arr[n - 2]) {
	        return 0;
	    }
	    return checkSorting(arr, n - 1);
	}
