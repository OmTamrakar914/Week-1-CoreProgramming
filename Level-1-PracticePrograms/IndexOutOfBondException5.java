// Create a method for string out of bound index

import java.util.Scanner;

public class IndexOutOfBondException5{
	
	// method to genrate the Exception by try catch block
	public static void generateException(String str){
		int length = str.length();
		 
		try{
	    // Attempt to Access the index character of string of its length
		for(int i=0; i<length; i++){
			System.out.println("char at index "+i+" of string is: ");
			System.out.println("The length of String is "+ str.charAt(length+1));
		}
		
			
		}catch(IndexOutOfBoundsException e){
			 e.printStackTrace();
		}
	}
	
	// method to handle the Exception by try catch block
	public static void handlingException(String str){
		 		int length = str.length();
		try{
			for(int i=0; i<length; i++){
			System.out.println("char at index "+i+" of string is: ");
			System.out.println("The length of String is "+ str.charAt(length+1));
		}
		}catch(IndexOutOfBoundsException e){
			//calling built in methods in this null variable to generate excception
			System.out.println("IndexOutOfBoundsException caught");
			System.out.println("Index Out Of Bounds Exception => "+e.getMessage());
		}
	} 
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		IndexOutOfBondException5 demo = new IndexOutOfBondException5();
		
       // Calling method to gemrate exception
	   System.out.println(" Calling method to generating IndexOutOfBoundsException...");
	   demo.generateException(str);
	  // Attempt to call a String method on the null variable
            
	
        // Call the method to handle the exception
	    System.out.println("Calling method to handle IndexOutOfBoundsException...");
		demo.handlingException(str);
		
		sc.close();
	}
	
}