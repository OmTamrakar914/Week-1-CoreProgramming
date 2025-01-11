// Calculating the factor using loop


 import java.util.Scanner;

public class  FactorOfNumber11{
	public static void main(String []args){
		//Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking the no. input
         System.out.println("Enter the Number");
		int number = sc.nextInt();
		
		//calculating the factors of the numbers
		for(int i=1; i<=number; i++){
			if(number % i == 0){
				System.out.println(i+" is a factor of number "+number);
			}
		}
		
		
	}
}