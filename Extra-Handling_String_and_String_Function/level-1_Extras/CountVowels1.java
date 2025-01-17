// counting the vowels and consonant in a string

import java.util.Scanner;
public class CountVowels1{
	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		// taking input string
		System.out.println("enter the string");
		String str = sc.next();
		
		int vowels = 0, consonant = 0;
		//converting to lowecase
		str.toLowerCase();
		//checking the no. of vowels and consonant
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == 'a'){
				vowels++;
			}
			else if(str.charAt(i) == 'b'){
				vowels++;
			}
			else if(str.charAt(i) == 'c'){
				vowels++;
			}
			else if(str.charAt(i) == 'd'){
				vowels++;
			}
			 else if(str.charAt(i) == 'e'){
				vowels++;
			}
			else{
				consonant++;
			}
		}
		
		
		System.out.println("The Number of Vowels is : "+vowels);
		System.out.println("The Number of Consonant is :"+consonant);
		
	}
}