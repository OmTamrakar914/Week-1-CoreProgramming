//Calculating the multiples of the number

import java.util.Scanner;

public class  MultiplesOfNumber12{
	public static void main(String []args){
		//Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking the no. input
         System.out.println("Enter the Number");
		int number = sc.nextInt();
		
		//Calculating the multiples and printing them
		
		for(int i=100; i>=1; i--){
			if( i % number == 0){
				System.out.println(i+" is a multiple of the number "+number);
			}
		}
	}
}
