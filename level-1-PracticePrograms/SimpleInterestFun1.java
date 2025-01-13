import java.util.Scanner;

public class SimpleInterestFun1{
	
	//Method to calculate simple Interest
	public double calculateSI(double principle, double rate, double time){
		
		//calculating simple interest using formula
		double si= (principle * rate *time)/100;
		return si;
		
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//taking user input in principle variable
		System.out.println("Enter the principle amount: ");
		double principle = input.nextDouble();
		
		//taking user input in rate variable
		System.out.println("Enter the rate of interest: ");
		double rate = input.nextDouble();
		
		//taking user input in time variable
		System.out.println("Enter the time of interest: ");
		double time = input.nextDouble();
		
		//calculating the simple interest
		SimpleInterestFun1 obj =new SimpleInterestFun1(); 
		double simpleInterest = obj.calculateSI(principle ,rate, time);
		
		//printing the result
		System.out.println("The Simple Interest is " + simpleInterest+ " for Principal " + principle + ",Rate of Interest "+ rate +"% and Time "+ time + " years.");
		
		
		input.close();
	}
	
}