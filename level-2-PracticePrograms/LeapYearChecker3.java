// Checks if a given year is a Leap Year or not.

import java.util.Scanner;

public class LeapYearChecker3 {

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year conditions
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the year from the user
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();

        // Check if the year is valid for the Gregorian calendar
        if (year < 1582) {
            System.out.println("Invalid input! Year must be 1582 or later.");
            return; // Exit the program
        }

        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println("The year " + year + " is a Leap Year.");
        } else {
            System.out.println("The year " + year + " is NOT a Leap Year.");
        }

        scanner.close(); // Close scanner
    }
}
