// Create a substring and check if it equals to the substring created by using substring() method

// Compare the string and check 

import java.util.*;

public class CreateSubstring2{
	
	//created a CompareStr method to compare string and return a boolean answer
	public static String CreateSubstring(String one, int start, int end){
		
		//string substring to give the substring
		String substring = "";
		
		for(int i=start; i<end; i++){
			substring += one.charAt(i);
		}
		return substring;
	  } 
	  
	//created a CompareStr method to compare string and return a boolean answer
	public static boolean CompareStr(String one , String second){
		
		// checking the length of both strings are equal
		if(one.length() == second.length()){
			
			for(int i=0; i<one.length(); i++){
			if(one.charAt(i) != second.charAt(i)){ // comparing each character of the  strings
				return false;
			}
		  }
		  return true;
		}
		else{
			return false;
		}
	} 
	
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		//taking input two strings
		System.out.println("Enter the string");
		String string1 = sc.next();
		
		System.out.println("Enter the start index");
		int start = sc.nextInt();
		System.out.println("Enter the end index");
		int end = sc.nextInt();
		
		// Substring declared created by charAt method
		String userbuiltString = CreateSubstring(string1, start, end);
		
		//String answer for the substring created by substring built in method
		String prebuiltString = string1.substring(start, end);
		
		//compare the two string using CompareStr method and assign it to a variable ans
		boolean ans = CompareStr(prebuiltString, userbuiltString)  ;

       
		
		
		//checking the ans = compareStr methods results are equal
		if(ans){
			System.out.println("SubString 1 is : "+userbuiltString);
			System.out.println("SubString 2 is : "+prebuiltString);
			System.out.println("The Two SubStrings are equal");
		}
		else{
			System.out.println("SubString 1 is : "+userbuiltString);
			System.out.println("SubString 2 is : "+prebuiltString);
			System.out.println("The Two SubStrings are not equal");
		  }
		}
		sc.close();
    }
