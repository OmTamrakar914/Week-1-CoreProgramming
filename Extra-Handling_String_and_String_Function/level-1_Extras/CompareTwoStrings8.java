// Compare the string Lexographically

import java.util.*;

public class CompareTwoStrings8{
	
	//created a CompareStr method to compare string Lexographically
	public static String CompareStr(String one , String second){
		
		int length1 = one.length();
		int length2 = second.length();
		
		int length = Math.min(length1, length2);
		
		
		for(int i=0; i<length; i++){
			if(one.charAt(i) > second.charAt(i)){
				return second;
			}
			else if(one.charAt(i) < second.charAt(i)){
				return one;
			}
		}
		return "Strings are Lexographically equal!";
	} 
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		//taking input two strings
		System.out.println("Enter the string 1");
		String string1 = sc.next();
		System.out.println("Enter the string 1");
		String string2 = sc.next();
		
		//compare the two string using CompareStr() method and assign it to a variable ans
		String ans = CompareStr(string1,string2);
		
		String ans2 ="";
		if(ans.equals(string1)){
			ans2 += string2;
		}else{
			ans += string1;
		}
		
			System.out.println("String 1 is : "+string1);
			System.out.println("String 2 is : "+string2);
			if(ans.equals("Strings are Lexographically equal!")){
			 System.out.println(ans);
			}else
			System.out.println(ans+" comes before "+ans2+" in lexicographically order");
		
		}
    }
