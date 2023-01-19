/*
Problem Statement
Create class Inventory with below attributes: inventoryId - String maximumQuantity - int currentQuantity - int threshold - int

Create class Solution and implement static method "replenish" in the Solution class. This method will take array of Inventory objects and a limit int as parameters. 
And will return another array of Inventory objects where the limit int is lesser than or equal to the original array of Inventory object's threshold attribute.

Write necessary getters and setters.

Before calling "replenish" method in the main method, read values for four Inventory objects referring the attributes in above sequence along with a int limit. 
Then call the "replenish" method and write logic in main method to print "Critical Filling",if the threshold attribute is greater than 75. 
Else if the threshold attribute is between 50 and 75 then print "Moderate Filling". Else print "Non-Critical Filling"

INPUT:
1
100
50
50
2
200
60
40
3
150
35
45
4
80
45
40
45

OUTPUT:
2 Non-Critical Filling
3 Non-Critical Filling
4 Non-Critical Filling
*/

import java.util.*;
import java.io.*;
import java.lang.*;
public class findInventory { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory[] inventories = new Inventory[4];
        for (int i = 0; i < inventories.length; i++) {
            String inventoryId = sc.nextLine();
            int maximumQuantity = sc.nextInt();
            sc.nextLine();
            int currentQuantity = sc.nextInt();
            sc.nextLine();
            int threshold = sc.nextInt();
            sc.nextLine();
            inventories[i] = new Inventory(inventoryId, maximumQuantity, currentQuantity, threshold);
        }
        int limit = sc.nextInt();
        sc.close();
        Inventory[] result = replinish(limit, inventories);
        for (int i = 0; i < result.length; i++) {
            if (result[i].getThreshold() >= 75) {
                System.out.println(result[i].getInventoryId() + " Critical Filling");
            }
            else if(result[i].getThreshold() >= 50 && result[i].getThreshold() <= 74) {
                System.out.println(result[i].getInventoryId() + " Moderate Filling");
            } 
            else {
                System.out.println(result[i].getInventoryId() + " Non-Critical Filling");
            }
        }
    }
    
    public static Inventory[] replinish(int limit, Inventory[] inventory) {
        Inventory[] refined = new Inventory[0];
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i].getThreshold() <= limit) {
                refined = Arrays.copyOf(refined, refined.length + 1); // increasing the length of the array by 1
                refined[refined.length - 1] = inventory[i];
            }
        }
        return refined;
    }
}

class Inventory {
    String inventoryId;
    int maximumQuantity;
    int currentQuantity;
    int threshold;
    
    Inventory(String inventoryId, int maximumQuantity, int currentQuantity, int threshold) {
        this.inventoryId = inventoryId;
        this.maximumQuantity = maximumQuantity;
        this.currentQuantity = currentQuantity;
        this.threshold = threshold;
    }
    
    public String getInventoryId() {
        return inventoryId;
    }
    
    public int getThreshold() {
        return threshold;
    }
}
