// Find the Finding Frequency

import java.util.Scanner;


public class FindTheFrequency10{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		// taking number input
		 System.out.println("Enter the Number : ");
		 int number = sc.nextInt();
		 
		 //creating a count variable
		 int count = 0;
		 
		 //temporary
		 int temp = number;
		 
		while(temp != 0){
			count++;
			temp/=10;
		}
		
	    //declaring a array for digits
		 int digit[] = new int[count];
		 
		 for(int i=0; i<count;  i++){
			 digit[i] = number % 10;
			 number = number /10;
		 }
		 
		 //frequency array
		 int frequency[] = new int[10];
		 
		 for(int i=0; i<count; i++){
			frequency[digit[i]]++;
		 } 
		 
		 for(int i=0; i<10; i++){
			 if(frequency[i] > 0){
				  System.out.println("The Frequency of digit "+(i)+" is "+frequency[i]);
			 }
			
		 }
		 
		 sc.close();
	}
}