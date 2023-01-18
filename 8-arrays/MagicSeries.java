// Since, the ideology corresponds to arrays, I have added this to the arrays list
// here, add the numbers a and b with each other till N numbers
// separate them in 2 different lines to produce a Even number series and Odd number series
import java.util.*;
import java.io.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
		int N = 10;
		int a = 2;
		int b = 3;
		int first = a;
		int second = b;
		System.out.print(a + " ");
		System.out.print(b + " ");
		List<Integer> listEven = new ArrayList<>();
		List<Integer> listOdd = new ArrayList<>();
		int next = 0;
		for (int i = 2; i < N; i++) {
		    next = first + second;
		    if (next % 2 == 0) {
		        listEven.add(next);
		    } else {
		        listOdd.add(next);
		    }
		    first = second;
		    second = next;
		}
		
		for (int even : listEven) {
		    System.out.print(even + " ");
		}
		System.out.println();
		for (int odd: listOdd) {
		    System.out.print(odd + " ");
		}
	}
}
