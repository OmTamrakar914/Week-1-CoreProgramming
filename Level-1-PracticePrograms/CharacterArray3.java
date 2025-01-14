// Creating a character array from the string and from the tocharArray() method and compare them

// Compare the charArray and check 

import java.util.*;

public class CharacterArray3{
	
	//created a CompareStr method to compare string and return a boolean answer
	public static char[] findCharArr(String one){
		
		//string substring to give the substring
		char[] newcharArray = new char[one.length()];
		
		//looping through to each charcter and storing it in a characterarray
		for(int i=0; i<one.length(); i++){
			newcharArray[i]  += one.charAt(i);
		}
		return newcharArray ;
	  } 
	  
	//created a CompareStr method to compare characterarrays and return a boolean answer
	public static boolean CompareCharArray(char [] one , char[] second){
		
		// checking the length of both arrays are equal
		if(one.length == second.length){
			
			for(int i=0; i<one.length; i++){
			if(one[i] != second[i]){ // comparing each character of the  strings
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
		String string = sc.next();
		
		// CharArray declared created by user defined method
		char charArray1[] = findCharArr(string);
		
		// CharArray declared created by user predefined method
		char charArray2[] = string.toCharArray();
		
		//compare the character array using CompareStr method and assign it to a variable ans
		boolean ans = CompareCharArray(charArray1, charArray2)  ;

        System.out.println("Character Array 1 is : ");
		for(int i=0; i<charArray1.length; i++){
			System.out.print(charArray1[i]+", ");
		}
		
		 System.out.println("Character Array 2 is : ");
		for(int i=0; i<charArray2.length; i++){
			System.out.print(charArray2[i]+", ");
		}
       
		
		
		//checking the ans = comparecharArray methods results are equal
		if(ans){
			System.out.println("The Two Character Array are equal");
		}
		else{
			System.out.println("The Two Character Array are not equal");
		  }
		}
		sc.close();
    }
