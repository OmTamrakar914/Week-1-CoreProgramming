// Checking the palidrome string

import java.util.Scanner;
public class PalindromeCheck3{
	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		// taking input string
		System.out.println("enter the string");
		String str = sc.nextLine();
		
		//declaring the new string
		String newString = "";
	
		// Reversing the String
		for(int i=str.length()-1; i>=0; i--){
			newString += str.charAt(i);
		}
		
		if(str.equals(newString)){
			System.out.println("The String is a Palindrome");
		}
		else{
			System.out.println("The String is not a Palindrome");
		}
		
	}
}