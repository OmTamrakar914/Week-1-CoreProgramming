// Finding the Greatest Factor by Loop

import java.util.Scanner;

public class GreatestFactor9{
	public static void main(String []args){
		//Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking the no. input
         System.out.println("Enter the Number");
		int number = sc.nextInt();
		
		int greatestFactor = 1;
		
		//calculating the greatest factor
		
		for(int i = number - 1; i>= 1; i--){
			if(number % i == 0){
				greatestFactor = i;
				break;
			}
		}
		
		//printing the greatestFactor
		System.out.println("The GreatestFactor of the Number "+number+" is "+greatestFactor);
		
		
		
	}
}