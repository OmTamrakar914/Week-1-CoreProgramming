// checking leap year

import java.util.Scanner;

public class LeapYear1{
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        // taking input from the user
        System.out.println("Enter the year");
        int year = input.nextInt();
		
		//Checking it is a leap year or not
		
		if(year >= 1582){
			if(year % 400 == 0){
				System.out.println("It is a leap year");
			}
			else if(year % 4 == 0){
				if(year % 100 !=0){
					System.out.println("It is a leap year");
				}
			}
			else{
				System.out.println("It is not a leap year");
			}
		}
		else{
			System.out.println("It is not a leap year");
		}
		
		
	}
}