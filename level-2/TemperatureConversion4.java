import java.util.Scanner;

public class TemperatureConversion4 {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        //taking the temperature input in celsius variable.
        System.out.println("Enter the Temperature in Celsius");
        double celsius = input.nextDouble();

        //calculating the temperature in fehrenheit
        double fahrenheitResult = ( celsius *9 /5 ) +32;

        //printing the output
        System.out.println("The "+ celsius+ " celsius is " + fahrenheitResult + " fahrenheit.");
        
        input.close();
    }
}