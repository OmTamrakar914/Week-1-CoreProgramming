// Calculateing profit and profit percentage

import java.util.*;

public class ProfitAndPercentage4{
	public static void main(String []args){
		//cost price = 129
		//selling price = 191
		
		double costPrice = 129;
		double sellingPrice = 191;

		// Calculating the profit	
		double profit = sellingPrice - costPrice;
		
		//Calculating the profitPercentage
		double profitPercentage = (profit/costPrice)*100;

       
       System.out.println("The Cost Price is INR "+costPrice+" and Selling Price is INR "+sellingPrice+ "\nThe Profit is INR "+profit+" and the Profit Percentage is "+profitPercentage);	   
	}
}