// Calculating the reverse array

import java.util.Scanner;

public class ReverseArray5{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		// taking number input
		 System.out.println("Enter the Number");
		 int number = sc.nextInt();
		
		//count the digits in number
		int count = 0;
		
		int temp = number;
		while(temp !=  0){
			count++;
			temp /= 10;
		}
		
		//declaring an array reverse of size count
	    int reverse[] = new int[count];
	   int i = 0;
	   while(number !=  0){
		   reverse[i] = number%10;
		   number = number/10;
		   i++;
	   }
	   System.out.print("The Number in reverse order is : ");
	   for(int j=0; j<count ; j++){
		   System.out.print(reverse[j]);
	   }
	
		
		
		sc.close();
	}
}