// Returning the length of string without the lenght() method;

import java.util.Scanner;

public class LengthOfString1{

    //method to find the length of the string without using the length() method;
    public static int returnLength(String str){

        int count = 0;
        try{
            // initailizing the loop to count until an exception occur
        while(true){
            
                str.charAt(count);
                count ++;
              
            }
         }catch(IndexOutOfBoundsException e){
                // Exception is thrown when index exceeds the string length;
            }
           return count; // return the final count.
        
    }
    public static void main(String []args){
        // Scanner class
        Scanner sc = new Scanner(System.in);

        //input string
        System.out.println("Enter the String :");
        String str = sc.next();

        int userlength = returnLength(str);
        int prelength = str.length(); 

        System.out.println("The length of string by user method is :"+ userlength);
        System.out.println("The length of string by predefined method is :" + prelength);
        sc.close();
    }
}