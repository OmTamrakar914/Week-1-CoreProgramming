// Calculating MaxFactor

import java.util.Scanner;

public class MaxFactor8{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		//taking a number input
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		//declaring a variable MaxFactor
		int maxFactor = 10;
		int index = 0;
		
		int factor[] = new int[maxFactor];
		
		//looping through the factors 
		for(int i=1; i<=number; i++){
			
			if(number % i == 0){
				if(index == maxFactor){
					maxFactor *= 2;
					int temp [] = new int[maxFactor];
					for(int j=0; j<maxFactor; j++){
						temp[j] = factor[j];
					}
					factor = temp;
				}
				factor[index] = i ;
				index++;
				
			}
			
		   
		}
		
		//printing the factors
		for(int i=0; i<index; i++){
			System.out.println("The Factor of the Number is "+factor[i]);
		}
		
		
	}
}