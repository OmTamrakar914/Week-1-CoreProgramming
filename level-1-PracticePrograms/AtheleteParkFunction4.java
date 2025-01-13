import java.util.Scanner;

public class AtheleteParkFunction4{
	
	// method to calculate maximum number of rounds 
	public double calculateRouns(double len1, double len2, double len3){
	
	    //calculating perimeter
		double perimeter= len1+ len2 +len3;
		
		//creating runnable length variable
		double runLength=5000;
		
		//calculating rounds
		double rounds= runLength /perimeter;
		
		return rounds;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//taking user input in length1 variable
		System.out.println("Enter the length of side1: ");
		double length1 = input.nextDouble();
	
	    //taking user input in length2 variable
		System.out.println("Enter the length of side2: ");
		double length2 = input.nextDouble();
		
		//taking user input in length3 variable
		System.out.println("Enter the length of side3: ");
		double length3 = input.nextDouble();
		
	    //calculating the maximun number of rounds he can run
		AtheleteParkFunction4 obj=new AtheleteParkFunction4();
		double rounds=obj.calculateRouns(length1,length2,length3);
		
		//printing the result
		System.out.println("The maximum number of rounds is " + rounds + ".");
		
		
		
		input.close();
	}
	
}