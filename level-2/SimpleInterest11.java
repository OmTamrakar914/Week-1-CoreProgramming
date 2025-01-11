import java.util.Scanner;

public class SimpleInterest11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // taking input in principal variable
        System.out.println("Enter the principle");
        double principle = input.nextDouble();
        
        // taking input in rate variable
        System.out.println("Enter the rate of interest");
        double rate = input.nextDouble();
        
        // taking input in time variable
        System.out.println("Enter the time");
        double time = input.nextDouble();

        //calculating the simple interest
        double simpleInterest = principle * rate * time / 100 ;

        // printing the output
        System.out.println("The simple interest is " + simpleInterest + " for principle "+ principle + ", rate of interest " + rate + " and Time " + time );

        input.close();
    }
}