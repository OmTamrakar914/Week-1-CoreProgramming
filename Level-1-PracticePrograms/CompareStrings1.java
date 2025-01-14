// Compare the string and check by equal method

import java.util.*;

public class CompareStrings1{
	
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
		System.out.println("Enter the string 1");
		String string1 = sc.next();
		System.out.println("Enter the string 1");
		String string2 = sc.next();
		
		//compare the two string using equals() method and assign it to a variable ans
		boolean ans = string1.equals(string2);
		
		//checking the ans = compareStr methods results are equal
		if(ans == CompareStr(string1,string2) && ans == true){
			System.out.println("String 1 is : "+string1);
			System.out.println("String 2 is : "+string2);
			System.out.println("The Strings are equal");
		}
		else{
			System.out.println("String 1 is : "+string1);
			System.out.println("String 2 is : "+string2);
			System.out.println("The Strings are not equal");
		  }
		}
    }
