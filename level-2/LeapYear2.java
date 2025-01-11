// Leap year with onnly one condition


import java.util.Scanner;

public class LeapYear2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // taking input from the user
        System.out.println("Enter the year:");
        int year = input.nextInt();
		
		//checking for leap year
		if(year >=1582 && ((year % 4 ==0 && year % 100 !=0) || (year % 400 == 0))){
			System.out.println("It is a leap year");
		}
		else {
			System.out.println("It is not leap year");
		}
	}
}
