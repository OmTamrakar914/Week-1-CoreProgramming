// Multiplication table using array

import java.util.Scanner;

public class MultiplicationTable3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		//declaring the array
		int table[]= new int[10];
		
		//taking input the number
		System.out.println("enter the number");
		int number = sc.nextInt();
		
		// calculating the multiplication table
		for(int i=0; i<10; i++){
	
			table[i] = number * (i+1);
		}
		//Printing the table
		for(int i=0; i<10; i++){
			
			System.out.println(+number+" * "+(i+1)+" = "+table[i] );
		}
		
	}
}