import java.util.Scanner;

public class WindChill11 {

    // method to calculate the wind chill
    public double calculateWindChill(double temperature, double windSpeed) {

        // calculating the wind chill
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // taking user input in temperature variable
        System.out.println("Enter the Temperature: ");
        double temperature = input.nextDouble();

        // taking user input in windSpeed variable
        System.out.println("Enter the Wind speed: ");
        double windSpeed = input.nextDouble();

        // calculating windChill using function
        WindChill11 obj = new WindChill11();
        double windChill = obj.calculateWindChill(temperature, windSpeed);

        // printing the output
        System.out.println("The wind Chill for temperature " + temperature + " and wind speed " + windSpeed + " is "
                + windChill + ".");

        input.close();

    }
}