// Taking two no. input and add, substract, divide, and multiply and giving answer for each 

import java.util.*;

public class Calculator11{
	public static void main(String []args){
		// Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking two no. input
		System.out.println("enter first no.");
		float a = sc.nextInt();
		
		System.out.println("enter the second no.");
		float b = sc.nextInt();
		
		//add
		double added = a+b;
		
		//substract
		double substract = a-b;
		
		//multiply
		double multiply = a*b;
		
		//divide
		double divide = a/b;
		
		//printing the answers for each operation
		System.out.println("The addition, substraction, multiplication, and division of 2 numbers "+a+" and "+b+" is "+added+", "+substract+", "+multiply+", "+divide);
		
	}
}