//Calculating power using loop 

import java.util.Scanner;

public class FindingPower10{
	public static void main(String []args){
		//Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking the no. input
         System.out.println("Enter the Number");
		int number = sc.nextInt();
		
		System.out.println("Enter the power");
		int power = sc.nextInt();
		
		int result = 1;
		
		//calculating power
		for(int i = 1 ; i <= power; i++){
			result *= number;
		}
		
		//printing the result
		System.out.println("The result is "+result);
		
		sc.close();
		
	}
}