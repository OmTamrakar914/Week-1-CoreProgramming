// A utility class for various unit conversions (Yards to Feet, Meters to Inches, etc.)

public class UnitConverter5 {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3; // Conversion factor
        return yards * yards2feet; // Convert and return the result
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333; // Conversion factor
        return feet * feet2yards; // Convert and return the result
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701; // Conversion factor
        return meters * meters2inches; // Convert and return the result
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254; // Conversion factor
        return inches * inches2meters; // Convert and return the result
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54; // Conversion factor
        return inches * inches2cm; // Convert and return the result
    }

    public static void main(String[] args) {
        // Test the conversion methods
        double yards = 5.0; // Example yards value
        double feet = convertYardsToFeet(yards); // Convert yards to feet
        System.out.println(yards + " yards = " + feet + " feet");

        double feetInput = 15.0; // Example feet value
        double yardsFromFeet = convertFeetToYards(feetInput); // Convert feet to yards
        System.out.println(feetInput + " feet = " + yardsFromFeet + " yards");

        double meters = 2.0; // Example meters value
        double inches = convertMetersToInches(meters); // Convert meters to inches
        System.out.println(meters + " meters = " + inches + " inches");

        double inchesInput = 12.0; // Example inches value
        double metersFromInches = convertInchesToMeters(inchesInput); // Convert inches to meters
        System.out.println(inchesInput + " inches = " + metersFromInches + " meters");

        double inchesForCm = 10.0; // Example inches value
        double cm = convertInchesToCm(inchesForCm); // Convert inches to cm
        System.out.println(inchesForCm + " inches = " + cm + " centimeters");
    }
}


