// program to calculate the age of Henry

import java.util.*;

public class AgeOfHenry1{
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		// henry's birth year is 2000
		int birthYear = 2000;
		int currentYear = 2024;
		
		int age = currentYear - birthYear;
		
		System.out.print("Harry's age in 2024 is "+age);
		
	}
}