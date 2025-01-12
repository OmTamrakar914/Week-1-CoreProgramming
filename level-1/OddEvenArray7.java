// Creating odd and even arrays from input no
import java.util.Scanner;

public class OddEvenArray7{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		//taking input form the users
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		if(number <0){
			System.err.println("Not a natural number");
     	}
		else{
		    //declaring the odd and even array
		     int even[] = new int[number/2+1];
		     int odd[] = new int[number/2+1];
			 
			 //two variable for array index
			 int j = 0;
			 int k = 0;
			 for(int i=1; i<=number; i++){
				 if(i % 2==0){
					 even[j] = i;
					 j++;
				 }
				 else{
					 odd[k] = i;
					 k++;
				 }
			 }
			 System.out.println("The even numbers are :");
			 for(int g=0; g<j; g++){
				 System.out.println(even[g]);
			 }
			  System.out.println("The odd numbers are :");
			 for(int l=0; l<k; l++){
				 System.out.println(odd[l]);
			 }
	    }
	}

}

