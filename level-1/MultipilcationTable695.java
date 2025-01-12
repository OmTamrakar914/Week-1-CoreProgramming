// Multiplication table 6 to 9

import java.util.Scanner;

public class MultipilcationTable695{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		//taking the number input
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		//declaring the array
		int table[] = new int[10];
		
		if(num >=6 && num <=9){
			for(int i=0; i<10; i++){
				table[i] = num * (i+1);
			}
		}
		
		//display the result
		for(int i=0; i<10; i++){
			
	    System.out.println(+num+" * "+(i+1)+" = "+table[i]);
		}
		
		
	}
}