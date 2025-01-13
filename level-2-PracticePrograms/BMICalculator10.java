import java.util.Scanner;

// Class name: BMICalculator
public class BMICalculator10 {

    // Method to calculate BMI for each person and populate the BMI array
    public static void calculateBMI(double[][] personData) {
        for (int i = 0; i < personData.length; i++) {
            // Convert height from cm to meters
            double heightInMeters = personData[i][1] / 100;
            // Calculate BMI using the formula
            double bmi = personData[i][0] / (heightInMeters * heightInMeters);
            personData[i][2] = bmi;  // Store BMI in the third column
        }
    }

    // Method to determine the BMI status for each person
    public static String[] determineBMIStatus(double[][] personData) {
        String[] bmiStatus = new String[personData.length];
        for (int i = 0; i < personData.length; i++) {
            double bmi = personData[i][2];  // Get BMI from the array
            if (bmi <= 18.4) {
                bmiStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                bmiStatus[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                bmiStatus[i] = "Overweight";
            } else {
                bmiStatus[i] = "Obese";
            }
        }
        return bmiStatus;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for user input
        double[][] personData = new double[10][3]; // 2D array to store weight, height, and BMI for 10 persons

        // Input the weight and height for 10 persons
        System.out.println("Enter weight (kg) and height (cm) for 10 people:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            personData[i][0] = scanner.nextDouble();  // Store weight
            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            personData[i][1] = scanner.nextDouble();  // Store height
        }

        // Calculate BMI for each person
        calculateBMI(personData);

        // Get BMI status for each person
        String[] bmiStatus = determineBMIStatus(personData);

        // Display the results
        System.out.println("\nBMI Report:");
        System.out.println("Person | Weight (kg) | Height (cm) | BMI      | Status");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-7d | %-12.2f | %-12.2f | %-8.2f | %s\n", 
                (i + 1), personData[i][0], personData[i][1], personData[i][2], bmiStatus[i]);
        }

        scanner.close(); // Close the scanner
    }
}

