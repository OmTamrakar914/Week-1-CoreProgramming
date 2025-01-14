// Create a method for string out of bound index

import java.util.Scanner;

public class ArrayIndexOutOfBoundsException8{
	
	// method to genrate the Exception by try catch block
	public static void generateException(String arr[]){
		int length = arr.length;
		 
		try{
	    // Attempt to Access the index character of array of its length
		for(int i=0; i<length; i++){
			System.out.println("name at index "+i+" of string is: "+arr[i]);
			System.out.println("The length of String is "+ arr[length+1]);
		}	
		}catch(ArrayIndexOutOfBoundsException e){
			//printing the exception
			 e.printStackTrace();
		}
	}
	
	// method to handle the Exception by try catch block
	public static void handlingException(String arr[]){
		 		int length = arr.length;
		try{
			for(int i=0; i<length; i++){
			System.out.println("char at index "+i+" of string is: "+ arr[i]);
			System.out.println("The length of String is "+ arr[length+1]);
		}
		}catch(ArrayIndexOutOfBoundsException e){
			// methods to handle generate excception
			System.out.println("IndexOutOfBoundsException caught");
			System.out.println("Index Out Of Bounds Exception => "+e.getMessage());
		}
	} 
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		String name[] = new String[5];
		
		for(int i=0; i<5; i++){
			System.out.println("Enter the person name "+(i+1)+": ");
			name[i] = sc.next();
		}
	
       // Calling method to gemrate exception
	   System.out.println(" Calling method to generating ArrayIndexOutOfBoundsException...");
	   generateException(name);
	  // Attempt to call a String method on the null variable
            
	
        // Call the method to handle the exception
	    System.out.println("Calling method to handle ArrayIndexOutOfBoundsException...");
		handlingException(name);
		
		sc.close();
	}
	
}