// Removing the dupicates from an string

import java.util.Scanner;
public class RemoveDuplicatesString4{
	
	public static String removeDuplicates(String str){
		int arr[] = new int[255];
		
		//declaring the new string
		String newString = "";
		
		for(int i=0; i<str.length(); i++){

			arr[str.charAt(i)]++;
		}
		for(int i=0; i<str.length(); i++){
			if(arr[str.charAt(i)] >0){
				newString += str.charAt(i);
				arr[str.charAt(i)] = 0;
			}
		}
	
		return newString;
	}
	public static void main(String []args){
		
		
		Scanner sc = new Scanner(System.in);
		// taking input string
		System.out.println("enter the string");
		String str = sc.nextLine();
		
		//declaring the new string
		String newString = removeDuplicates(str);
	
	
		System.out.println("The String is :"+str);
		System.out.println("The String with Remove Duplicates is : "+newString);
		
		
	}
}