// Calculating the total price 

import java.util.*;

public class CalculateTotal15{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		//taking input unitPrice and quantity
		
		System.out.println("enter unit Price");
		
	    double unitPrice = sc.nextDouble();
		
		System.out.println("enter quantity");
		
		double quantity = sc.nextDouble();
		
		// calculating total
		double total = unitPrice*quantity;
		
		//printing the total
		System.out.println("The total purchase price is INR "+total+" if the quantity is "+quantity+" and unit price is INR "+unitPrice);
		
		
	}
}