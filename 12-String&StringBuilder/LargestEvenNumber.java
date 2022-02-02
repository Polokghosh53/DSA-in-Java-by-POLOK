import java.util.Scanner;
import java.util.*;
public class Main
{
    public static void swap(int i, int j, ArrayList<Integer> list){
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		boolean isEven = false;
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < str.length(); i++){
		    char cur = str.charAt(i);
      // checking the numbers from the string
		    if(Character.isDigit(cur)){
		        int digit = Integer.parseInt(String.valueOf(cur));
		        
          // avoiding duplicate numbers
		        if(!list.contains(digit)){
		            list.add(digit);
		        }
          // checking if even number is present there or not
		        if(digit % 2 == 0){
		            isEven = true;
		        }
		    }
		}
		if(!isEven){
		    System.out.println(-1);
		}
		else{
		    Collections.sort(list, Collections.reverseOrder());
		    
		    int last = list.get(list.size() - 1);
		    
		    if(last % 2 != 0){
		        for(int i = list.size() - 2; i >= 0; i--){
		            int cur = list.get(i);
		            
		            if(cur % 2 == 0){
		                swap(i, list.size() - 1, list);
		                break;
		            }
		        }
		    }
		    String res = "";
		    for(int num : list){
		        res += num;
		    }
		    System.out.println(res);
		}
	}
}


/* 
Sample Input:
1 -> infosys@337
2 -> Hello#81@21349

Sample Output:
-1
984312
*/
