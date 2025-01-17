// Removing a character from the string 

import java.util.Scanner;
public class RemoveCharacter10{
	
	//method for Removing a specific character 
	public static String removeChar(String str, char c){
		
		String newString = "";
		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) != c){
				newString += str.charAt(i);
			}
		}
		return newString;
	}
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		String str = sc.next();
		
		//taking input the character to remove
		System.out.println("Enter a character to remove : ");
	    char c = sc.next().charAt(0);
		
		// string ans
		String ans = removeChar(str,c);
		
		System.out.println("The Original String is : "+str);
		System.out.println("The New String is : "+ans);
		

     sc.close();		
	}
}