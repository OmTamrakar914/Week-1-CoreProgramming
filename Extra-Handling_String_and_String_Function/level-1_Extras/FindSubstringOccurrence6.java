// Find the Substring occurrence in a string


import java.util.Scanner;
public class FindSubstringOccurrence6{
	
	//method to count occurrece of substring
	public static int countOccurrence(String str, String substring){
		int count = 0;
		int index = 0;

        //looping throught the string to count all the occurrence
		while((index = str.indexOf(substring,index)) != -1){
			count++;
			index += substring.length();
		}
		return count;
	}
	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		
		// taking input string
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		
		// taking input substring
		System.out.println("Enter the SubString : ");
		String substring = sc.nextLine();
		
		//calling the countOccurrence method 
		int occurrence = countOccurrence(str, substring);
		
		//displaying the result
		System.out.println("The Total number of occurrence of Substring - "+substring+" is : "+occurrence );
		
		sc.close();
	}
}