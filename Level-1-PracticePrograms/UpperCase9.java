// program to convert the lowercase to uppercase

import java.util.*;

public class UpperCase9{
	
	//uppercase the string by userdefined method 
	public static String upperCaseMethod(String str){
		String newStr = "";
		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
			newStr += (char)(str.charAt(i) - 32);
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
		String userUpperCase = upperCaseMethod(str);
		//uppercase the string by predefined method toUpperCase();
		String preUppercase = str.toUpperCase();
		
		boolean ans = CompareCase(userUpperCase, preUppercase);
		
		//checking the ans = compareStr methods results are equal
		if(ans ){
			System.out.println("String uppercase 1 is : "+userUpperCase);
			System.out.println("String uppercase 2 is : "+preUppercase);
			System.out.println("The Strings are equal");
		}
		else{
			System.out.println("String uppercase 1 is : "+userUpperCase);
			System.out.println("String uppercase 2 is : "+preUppercase);
			System.out.println("The Strings are not equal");
		  }
		  
		  sc.close();
		}
		
		
		
	 }
	
   
