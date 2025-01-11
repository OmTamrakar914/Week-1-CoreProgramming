import java.util.Scanner;

public class WeightConversion12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // taking input in weight variable
        System.out.println("Enter the weight in pounds");
        double weightInPound = input.nextDouble();

        //calculating weight in kilograms
        double weightInKilogram = weightInPound * 2.2 ;

        // printing the output
        System.out.println("The weight of the person in pound is " + weightInPound +" and in kg is " + weightInKilogram + ".");
        
        input.close();
    }
}