// Calculating largest and second largest 

import java.util.Scanner;


public class LargestSecondLargest3{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		// taking number input
		 System.out.println("Enter the Number");
		 long number = sc.nextLong();
		 
		 //maxDigit
		 int maxDigit = 10;
		 
		 //defining the array
		 long digit[] = new long[maxDigit];
		 
		 //index variable
		 int index = 0;
		 
		 while(number != 0){
			 if(index == maxDigit){
				 break;
			 }
			 digit[index] = number % 10;
			 number = number / 10;
			 index ++;
		 }
		 
		 //declaring largest and second largest
		 long largest = Integer.MIN_VALUE;
		 long secondLargest = Integer.MIN_VALUE;
		 
		 // looping through the array
		 for(int i=0; i<index; i++){
			 if(largest < digit[i]){
				 secondLargest  = largest;
				 largest = digit[i];
			 }
			 else if(digit[i] < largest && digit[i] > secondLargest){
				 secondLargest = digit[i];
			 }
		 }
		 
		 //printing the answer
		 System.out.println("The Largest number is : "+largest);
		 System.out.println("The Second Largest number is : "+secondLargest);
		 
		 
		 
		 sc.close();
	}
}