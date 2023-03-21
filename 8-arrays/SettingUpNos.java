import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr = {0, 2, 1, 0, 1, 2};
		sort012(arr);
    // [1, 1, 0, 0, 2, 2]
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sort012(int[] arr) {
	    int count0 = 0;
	    int count1 = 0;
	    int count2 = 0;
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == 0) {
	            count0++;
	        } else if (arr[i] == 1) {
	            count1++;
	        } else {
	            count2++;
	        }
	    }
	    int i = 0;
	    while (count1 > 0) {
	        arr[i++] = 1;
	        count1--;
	    }
	    while (count0 > 0) {
	        arr[i++] = 0;
	        count0--;
	    }
	    while(count2 > 0) {
	        arr[i++] = 2;
	        count2--;
	    }
	}
}
