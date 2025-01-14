// Create a method for Illegal Argument Exception

import java.util.Scanner;

public class IllegalArgumentException6{
	
	// method to genrate the Exception by try catch block
	public static void generateException(String str){
		int length = str.length();
		 String sub ="";
		try{
	    // setting the start the index greater than the end index 
		int endIndex  = length - 1;
        int startIndex = endIndex +20; 	
        sub = str.substring(startIndex, endIndex);			
		}
		catch(Exception e){
			throw new IllegalArgumentException("Invalid Argument!");
			// e.printStackTrace();
		}
		
	}
	
	// method to handle the Exception by try catch block
	public static void handlingException(String str){
		 		int length = str.length();
		        String sub = "";
		try{
			// setting the start the index greater than the end index 
		     int endIndex  = length - 1;
             int startIndex = endIndex +20 ; 	
            sub = str.substring(startIndex, endIndex);		
		}catch(Exception e){
			//calling built in methods in this null variable to generate excception
			throw new IllegalArgumentException("Invalid Argument!");
		}
	} 
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.next();
		
		IllegalArgumentException6 demo = new IllegalArgumentException6();
		
       // Calling method to gemrate exception
	   try{
		    System.out.println(" Calling method to generating IllegalArgumentException...");
	        demo.generateException(str);
	   }catch(Exception e){
		   e.printStackTrace();
	   }
	  
	  // Attempt to call a String method on the null variable
           
        // Call the method to handle the exception
		 try{
		   System.out.println("Calling method to handle IllegalArgumentException...");
	     	demo.handlingException(str);
	     }catch(Exception e){
	 	  System.out.println("Illegal Argument Exception caught ...");
	   }
		
	    
		
		
		sc.close();
	}
	
}