// Calculating side of Square from perimeter

import java.util.*;

public class SideOfSquare13{
	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		
		//Taking perimeter input
		System.out.println("enter the perimeter");
		double perimeter = sc.nextDouble();
		
		//calculating side of square
		double sideSquare = perimeter/4;
		
		//printing the answer
		System.out.println("The length of the side is "+sideSquare+" whose perimeter is "+perimeter);
		
	}
}