// Calculating University fees with discounted amount by taking input from users

import java.util.*;

public class InputUniversityFees6{
	public static void main(String []args){
		// Scanner class
		Scanner sc = new Scanner(System.in);
		
		// taking input and assign a Fees to a variable fees 
		System.out.println("enter your fees");
		int fees = sc.nextInt();
		
		//taking input and asign discout percentage to a variable discounPercentage
		System.out.println("enter discount percentage");
		int discountPercentage = sc.nextInt();
		
		
		//Computing discount and assigning it to discount variable
		int discount = (fees/100)*discountPercentage;
		
		//Computing discounted fees
		int discountedFees = fees - discount;
		
		//Printing the discounted fees
		System.out.println("The discount amount is INR "+discount+" and final discounted fees is "+discountedFees);
		
		
	}
}