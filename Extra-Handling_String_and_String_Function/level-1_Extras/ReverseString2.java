// Reverse the string without using built in  method

import java.util.Scanner;
public class ReverseString2{
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
		
		System.out.println("The String is :"+str);
		System.out.println("The Reverse String is : "+newString);
		
		
	}
}