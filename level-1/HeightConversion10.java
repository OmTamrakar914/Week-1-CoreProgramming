// taking height as input and converting it to inches and centimeters

import java.util.*;

public class HeightConversion10{
	public static void main(String []args){
		// Scanner class
		Scanner sc = new Scanner(System.in);
		
		//Taking height as input and assigning it to variable height
		System.out.println("enter height in centimeters");
		double centimeters = sc.nextInt();
		
		//converting it to inches 
		double inches = centimeters/2.54  ;
		
		//converting it to heightinFoot
		double heightinFoot = centimeters/(12*2.54);
		
		//printing the height in inches and Feet
		System.out.println("Your Height in cm is "+centimeters+" while in feet is "+heightinFoot+" and in inches is "+inches);
		
	}
}
