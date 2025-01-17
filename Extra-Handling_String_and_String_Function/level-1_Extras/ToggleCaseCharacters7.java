// program to convert the lowercase to uppercase and vice versa

import java.util.*;

public class ToggleCaseCharacters7{
	
	//togglecase the string by userdefined method 
	public static String toggleCaseMethod(String str){
		String newStr = "";
		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
			newStr += (char)(str.charAt(i) - 32);
		   }else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
			   
			   newStr += (char)(str.charAt(i) + 32);
		   }
		}
		
		return newStr;
	}

	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		// declaring a string and taking a line input
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		
		//toggle case the string by userdefined method
		String toggleCase = toggleCaseMethod(str);
		
		// display the result
			System.out.println("Original String is : "+str);
			System.out.println("Toggled String is  : "+toggleCase);
			
		  sc.close();
		}	
	 }
	
   
