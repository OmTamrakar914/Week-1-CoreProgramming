// Finding the sum of number till user enter zero

import java.util.Scanner;

public class CheckForZero4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		//declaring the array
		double number[]= new double[10];
		
		//Initializing a variable total 
		double total = 0.0;
		
		//taking the number input
		System.out.println("Enter the number");
		double num = sc.nextDouble();
		 
		
		// taking input numbers
		int i = 0;
		
		while(num != 0 && num > 0 && i <10){
			number[i] = num;
			System.out.println("Enter the number");
			num = sc.nextDouble();
			
			i++;
		}
		
		// adding the number and // priting the answer
		for(int j=0; j<10 ; j++){
			 if(number[j]<=0){
				 break;
			 }else {
				 total =total + number[j];
			   System.out.println("The number is "+number[j]);
               
			 }
		}
		System.out.println("The sum of numbers is "+total);
		
		
		
		
		
	}
}