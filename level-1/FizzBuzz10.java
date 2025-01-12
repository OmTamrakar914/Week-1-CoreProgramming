// FizzBuzz program

import java.util.Scanner;

public class FizzBuzz10{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		//taking a number input rows and columns
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		//checking it is a positive number or not
		if(number>0){
			
			//declaring the array
		    String fizzbuzz[] = new String[number];
			
			//looping through the numbers
			for(int i=1; i<=number; i++){
				if(i % 3 == 0 && i % 5 != 0) {
					fizzbuzz[i-1] = "Fizz"; 
				}
				else if(i % 3 != 0 && i % 5 == 0){
					fizzbuzz[i-1] = "Buzz"; 
				}
				else if(i % 3 == 0 && i % 5 == 0){
					fizzbuzz[i-1] = "FizzBuzz"; 
				}
				else{
					fizzbuzz[i-1] = String.valueOf(i);
				}
			}
			// Printing the FizzBuzz output
            for (String output : fizzbuzz) {
                System.out.println(output);
            }
		}
          else {
            System.out.println("Please enter a positive number.");
        }
		sc.close();
	}
}
		