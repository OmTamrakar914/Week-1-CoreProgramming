// FizzBuzz program using While loop

import java.util.Scanner;

public class FizzBuzzWhileLoop6{
	public static void main(String[]args){
		//Scanner class
		 Scanner sc = new Scanner(System.in);
		 
		 //taking input the number
		  System.out.println("Enter the number");
		 int n = sc.nextInt();
		 
		 //checking it is a positive number
		 if(n>0){
			 int i=0;
           while(i<=n){
			   //multiple of 3 but not of 5
			   if(i%3==0 && i%5!=0){
				   System.out.println("Fizz");
			   }
			   //multiple of 5 but not of 3
			   else if(i%5==0 && i%3!=0){
				   System.out.println("Buzz");
			   }
			   //multiple of both 3 andf 5
			   else if(i%5==0 && i%3==0){
				   System.out.println("FizzBuzz");
			   }
			   //multiple of neither 3 nor 5
			   else{
				   System.out.println(i);
			   }
			   i++;
		   }

		}
		//if the condition is false it is a negative number
		else{
			System.out.println("It is a negative number");
		}
	}
}