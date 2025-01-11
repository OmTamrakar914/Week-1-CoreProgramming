import java.util.Scanner;

public class TemperatureConversion5 {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        //taking the temperature input in fahrenheit variable.
        System.out.println("Enter the Temperature in fahrenheit");
        double fahrenheit = input.nextDouble();

        //calculating the temperature in fehrenheit
        double celsiusResult = ( fahrenheit -32) * 5 /9;

        //printing the output
        System.out.println("The "+ fahrenheit+ " fahrenheit is " + celsiusResult + " celsius.");
        
        input.close();
    }
}