// program to convert the uppercase to lowercase 

import java.util.*;

public class LowerCase10{
	
	//uppercase the string by userdefined method 
	public static String lowerCaseMethod(String str){
		String newStr = "";
		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
			newStr += (char)(str.charAt(i) + 32);
		   }else{
			    newStr += str.charAt(i);
		   }
		}
		
		return newStr;
	}
	
	//created a CompareCase method to compare string and return a boolean answer
	public static boolean CompareCase(String one , String second){
		
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
		// declaring a string and taking a line input
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		
		//uppercase the string by userdefined method
		String userlowerCase = lowerCaseMethod(str);
		//uppercase the string by predefined method toUpperCase();
		String prelowerCase= str.toLowerCase();
		
		boolean ans = CompareCase(userlowerCase, userlowerCase);
		
		//checking the ans = compareStr methods results are equal
		if(ans ){
			System.out.println("String lowerCase 1 is : "+userlowerCase);
			System.out.println("String lowerCase 2 is : "+prelowerCase);
			System.out.println("The Strings are equal");
		}
		else{
			System.out.println("String lowerCase 1 is : "+userlowerCase);
			System.out.println("String lowerCase 2 is : "+prelowerCase);
			System.out.println("The Strings are not equal");
		  }
		  
		  sc.close();
		}
		
		
		
	 }
	
   
