
import java.util.Scanner;

public class NumberChecker9 {

    // Method to check if a number is positive or negative
    public static String isPositive(int number) {
        if (number > 0) {
            return "positive";
        } else if (number < 0) {
            return "negative";
        } else {
            return "zero";  // Case for zero
        }
    }

    // Method to check if a positive number is even or odd
    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    // Method to compare two numbers and return the result
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;  // num1 is greater
        } else if (num1 < num2) {
            return -1; // num1 is smaller
        } else {
            return 0;  // both are equal
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for user input
        int[] numbers = new int[5]; // Array to store 5 numbers

        // Taking user input for 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Loop through the array to check each number
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            // Check if the number is positive or negative
            String sign = isPositive(number);
            if (sign.equals("positive")) {
                // If positive, check if even or odd
                String evenOdd = isEven(number);
                System.out.println("Number " + number + " is positive and " + evenOdd + ".");
            } else if (sign.equals("negative")) {
                System.out.println("Number " + number + " is negative.");
            } else {
                System.out.println("Number " + number + " is zero.");
            }
        }

        // Compare the first and last element of the array
        int firstElement = numbers[0];
        int lastElement = numbers[numbers.length - 1];
        int comparisonResult = compare(firstElement, lastElement);

        // Display comparison result
        if (comparisonResult == 1) {
            System.out.println("First element (" + firstElement + ") is greater than last element (" + lastElement + ").");
        } else if (comparisonResult == -1) {
            System.out.println("First element (" + firstElement + ") is less than last element (" + lastElement + ").");
        } else {
            System.out.println("First element (" + firstElement + ") is equal to last element (" + lastElement + ").");
        }

        scanner.close(); // Close the scanner
    }
}

