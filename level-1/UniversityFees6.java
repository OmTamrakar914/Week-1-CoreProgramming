// Calculating University fees with discounted amount

import java.util.*;

public class UniversityFees6{
	public static void main(String []args){
		
		// assign a Fees toa variable fees 
		int fees = 125000;
		
		//asign discout percentage to a variable discounPercentage
		int discountPercentage = 10;
		
		//Computing discount and assigning it to discount variable
		int discount = (fees/100)*10;
		
		//Computing discounted fees
		int discountedFees = fees - discount;
		
		//Printing the discounted fees
		System.out.println("The discount amount is INR "+discount+" and final discounted fees is "+discountedFees);
		
		
	}
}