

// A utility class for Fahrenheit to Celsius, Pounds to Kilograms

public class UnitConverter6 {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9; // Conversion formula
        return fahrenheit2celsius; // Convert and return the result
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32; // Conversion formula
        return celsius2fahrenheit; // Convert and return the result
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592; // Conversion factor
        return pounds * pounds2kilograms; // Convert and return the result
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462; // Conversion factor
        return kilograms * kilograms2pounds; // Convert and return the result
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541; // Conversion factor
        return gallons * gallons2liters; // Convert and return the result
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172; // Conversion factor
        return liters * liters2gallons; // Convert and return the result
    }

    public static void main(String[] args) {
        // Test the conversion methods
        double fahrenheit = 98.6; // Example Fahrenheit value
        double celsius = convertFahrenheitToCelsius(fahrenheit); // Convert Fahrenheit to Celsius
        System.out.println(fahrenheit + "°F = " + celsius + "°C");

        double celsiusInput = 37.0; // Example Celsius value
        double fahrenheitFromCelsius = convertCelsiusToFahrenheit(celsiusInput); // Convert Celsius to Fahrenheit
        System.out.println(celsiusInput + "°C = " + fahrenheitFromCelsius + "°F");

        double pounds = 150.0; // Example pounds value
        double kilograms = convertPoundsToKilograms(pounds); // Convert pounds to kilograms
        System.out.println(pounds + " pounds = " + kilograms + " kilograms");

        double kilogramsInput = 68.0; // Example kilograms value
        double poundsFromKilograms = convertKilogramsToPounds(kilogramsInput); // Convert kilograms to pounds
        System.out.println(kilogramsInput + " kilograms = " + poundsFromKilograms + " pounds");

        double gallons = 10.0; // Example gallons value
        double liters = convertGallonsToLiters(gallons); // Convert gallons to liters
        System.out.println(gallons + " gallons = " + liters + " liters");

        double litersInput = 25.0; // Example liters value
        double gallonsFromLiters = convertLitersToGallons(litersInput); // Convert liters to gallons
        System.out.println(litersInput + " liters = " + gallonsFromLiters + " gallons");
    }
}

