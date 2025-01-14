// Create a method for string out of bound index

import java.util.Scanner;

public class NumberFormatException7{
	
	// method to genrate the Exception by try catch block
	public static void generateException(String str){
		int ans;
		try{
	    //trying to extract number from a string having no number
		str = str+'a';
			ans = Integer.parseInt(str);
		}catch(Exception e){
			 e.printStackTrace();
		}
	}
	
	// method to handle the Exception by try catch block
	public static void handlingException(String str){
		 		int ans;
				
		try{
			ans = Integer.parseInt(str);
		
		}catch(NumberFormatException e){
			//calling built in methods in handle to generated excception
			System.out.println("Number Format Exception caught");
			System.out.println("Number Format Exception7 => "+e.getMessage());
		}
	} 
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		String str = sc.next();
	
		
       // Calling method to genrate exception
	   System.out.println(" Calling method to generating Number Format Exception...");
	   generateException(str);

        // Call the method to handle theNum exception
	    System.out.println("Calling method to handle Number Format Exception...");
		handlingException(str);
		
		sc.close();
	}
	
}