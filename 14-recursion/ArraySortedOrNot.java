// https://www.geeksforgeeks.org/program-check-array-sorted-not-iterative-recursive/
public class Main
{
	public static void main(String[] args) {
		int arr[] = {20, 23, 23, 45, 78, 88};
		int n = arr.length;
		
		if(arraySortedOrNot(arr,n)){
		    System.out.println("YES\n");
		}
		else{
		    System.out.println("NO\n");
		}
	}
	
	static boolean arraySortedOrNot(int arr[], int n){
	    if(n == 0 || n == 1){
	        return true;
	    }
	    
	    for(int i = 1; i < n; i++){
	        if(arr[i - 1] > arr[i]){
	            return false;
	        }
	    }
	     return true;
	}
}
