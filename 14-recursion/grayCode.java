// https://practice.geeksforgeeks.org/problems/gray-code-1611215248/1/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println(graycode(2));
	}
	
	public static ArrayList<String> graycode(int n) {
	    if (n == 1) {
	        ArrayList<String> base = new ArrayList<>();
	        base.add("0");
	        base.add("1");
	        return base;
	    }
	    ArrayList<String> ans = graycode(n - 1);
        ArrayList<String> smallAns = new ArrayList<>();
	        
	    for (int i = 0; i < ans.size(); i++) {
            smallAns.add("0" + ans.get(i));
        }
	        
        for (int j = ans.size() - 1; j >= 0; j--) {
            smallAns.add("1" + ans.get(j));
        }
        return smallAns;
	}
}
