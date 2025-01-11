// calculating area of triangle in square inches and square centimeters

import java.util.*;

public class AreaOfTriangle12{
	public static void main(String []args){
	
	//Scanner class
	Scanner sc = new Scanner(System.in);
	
	//taking height and base input
	System.out.println("enter the base");
	double base = sc.nextInt();
	
	System.out.println("enter the base");
	double height = sc.nextInt();
	
	//converting to inches 
	double heightInches = height * 2.54;
	double baseInches = base * 2.54;
	
	//converting to Centimeter
	double heightCentimeter = height * 12;
	double baseCentimeter = base * 12;
	
	
	
	//finding area of triangle in square inches
	double areaInches = 0.5 * baseInches * heightInches;
	
	//finding area of triangle in square centimeters
	double areaCentimeter = 0.5 * baseCentimeter * heightCentimeter;
	
	//printing the area in both centimeter and inches
	System.out.println("The area of triangle in square inches is "+areaInches+" and in square in centimeters is "+areaCentimeter);
	
	
	}
}