// Checking the number positive, even, odd and equal

 import java.util.Scanner;

public class CheckingNumbers2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		//declaring the array
		int number[]= new int[5];
		
		// taking input numbers
		for(int i=0; i<5; i++){
			System.out.println("Enter the number");
			number[i] = sc.nextInt();
		}
		
		//checking a no. positive, negative  and then checking even or odd
		
		for(int i=0; i<5; i++){
			if(number[i] > 0){
				if(number[i] % 2==0){
					System.out.println("The number "+number[i]+" is positive and even");
				}
				else{
					System.out.println("The number "+number[i]+" is positive and odd");
				}
			}
			else if(number[i] == 0){
				System.out.println("The number "+number[i]+" is zero");
			}
			else{
				System.out.println("The number "+number[i]+" is negative");
			 }
			}
		
		
		if(number[0] > number[4]){
			System.out.println("The number "+number[0]+" is greater than "+number[4]);
		}
		else if(number[0]==number[4]){
			System.out.println("The number "+number[0]+" is equal to the "+number[4]);
		}
		else{
			System.out.println("The number "+number[0]+" is lesser than "+number[4]);
		}
       
	   }
	}

