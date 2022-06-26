import java.util.*;
public class Main
{
    
    static ArrayList<Integer> list = new ArrayList<>();
	  public static void main(String[] args) {
		System.out.println(increasingNumbers(2));
	}
	
	public static ArrayList<Integer> increasingNumbers(int n) {
	  // if n is 1: print: 0 to 9  
    if (n == 1) {
	        for (int i = 0; i <= 9; i++) {
	            list.add(i);
	            return list;
	        }
	    } else {
	        rec(1, n, 0);
	    }
	    return list;
	}
	
  // if n > 1: print the number to be like where twos digit should be like: 12 13 14 15 where 12 = 1 > 2 here and 11 should not be printed
	public static void rec(int last, int n, int num) {
	    if (n == 0) {
	        list.add(num);
	        return;
	    }
	    for (int i = last; i <= 9; i++) {
	        int a = num * 10 + i;
	        rec(i + 1, n - 1, a);
	    }
	}
}
