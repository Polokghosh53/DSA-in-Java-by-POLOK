/*
Problem Statement
Create a class TravelAgencies with below attributes:
regNo – int
agencyName – String
pakageType – String
price – int
flightFacility – boolean

Write getters, setters for the above attributes . Create constructor which takes parameter in the above sequence.

Create class Solution with main method. Implement two static methods – findAgencyWithHighestPackagePrice and agencyDetailsforGivenIdAndType in Solution class.

findAgencyWithHighestPackagePrice method:

This method will take array of TravelAgencies objects as an input parameter and return the highest package price from the given array of objects.

agencyDetailsForGivenIdAndType method:

This method will take three input parameters -array of TravelAgencies objects, int parameter regNo and String parameter packageType. 
The method will return the TravelAgencies object based on below conditions.

FlightFacility should be available.
The input parameters(regNo and packageType) should matched with the regNo and packageType of TravelAgencies object.
If any of the above conditions are not met, then the method should return null. 
Note : Same Travel agency can have more than one package type. Travel agency and package type combination is unique. All the searches should be case insensitive.

The above mentioned static methods should be called from the main method.

For findAgencyWithHighestPackagePrice method – The main method should print the highestPackagePrice as it is. 
For agencyDetailsForGivenIdAndType method -The main method should print the AgencyName and price of the returned object.
The AgencyName and price should be concatenated with : while printing.

INPUT:
123
A2Z Agency
Platinum
50000
true
345
SSS Agency
Gold
30000
false
987
Cox and Kings
Diamond
40000
true
888
Global Tours
Silver
20000
false
987
Diamond

OUTPUT:
50000
Cox and Kings:40000
*/
import java.util.*;
import java.io.*;
import java.lang.*;

public class travelAgencyprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TravelAgencies[] arr = new TravelAgencies[4];
        for (int i = 0;i < arr.length; i++) {
            int regNo = sc.nextInt();
            sc.nextLine();
            String agencyName = sc.nextLine();
            String packageType = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            boolean flightFacility = sc.nextBoolean();
            sc.nextLine();
            arr[i] = new TravelAgencies(regNo, agencyName, packageType, price, flightFacility);
        } 
        int getregNo = sc.nextInt();
        sc.nextLine();
        String getPackageType = sc.nextLine();
        sc.close();
        
        int maxPrice = findAgencyWithHighestPackagePrice(arr);
        System.out.println(maxPrice);
        
        TravelAgencies travelAgencies = agencyDetailsForGivenIdAndType(arr, getregNo, getPackageType);
        if (travelAgencies == null) {
            System.out.println("A string value should be printed here!");
        }
        else {
            System.out.println(travelAgencies.agencyName + ":" + travelAgencies.price);
        }
    }
    
    
    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] arr) {
        int maxPrice = arr[0].price;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].price > maxPrice) {
                maxPrice = arr[i].price;
            }
        }
        return maxPrice;
    }
    
    public static TravelAgencies agencyDetailsForGivenIdAndType(TravelAgencies[] arr, int regno, String packagetype) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i].flightFacility == true) {
                if (arr[i].regNo == regno && arr[i].packageType.equals(packagetype)) {
                    return arr[i];
                } 
            }
        }
        return null;
    }
}


class TravelAgencies {
    
    int regNo;
    String agencyName;
    String packageType;
    int price;
    boolean flightFacility;
    
    // constructor
    TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }
    
    public int getregNo() {
        return regNo;
    }
    public void setregNo(int regNo) {
        this.regNo = regNo;
    }
    public String getagencyName() {
        return agencyName;
    }
    public void setagencyName(String agencyName) {
        this.agencyName = agencyName;
    }
    public String getPackageType() {
        return packageType;
    }
    public void setpackageType(String packageType) {
        this.packageType = packageType;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    boolean getFlightFacility() {
        return flightFacility;
    }
    public void setflightFacility(boolean flightFacility) {
        this.flightFacility = flightFacility;
    }
}
