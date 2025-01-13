// Finds the sum of n natural numbers using recursion and formula, and compares results.

import java.util.Scanner;

public class NaturalNumbersSum2 {

    // Recursive method to calculate the sum of n natural numbers
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1; // Base case
        }
        return n + sumUsingRecursion(n - 1); // Recursive case
    }

    // Method to calculate the sum using the formula n * (n + 1) / 2
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2; // Formula for sum of n natural numbers
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the number from the user
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Check if input is a natural number
        if (n <= 0) {
            System.out.println("Invalid input! Enter a positive number.");
            return; // Exit the program
        }

        // Calculate sums using recursion and formula
        int sumRecursion = sumUsingRecursion(n);
        int sumFormula = sumUsingFormula(n);

        // Display results
        System.out.println("Sum using recursion: " + sumRecursion);
        System.out.println("Sum using formula: " + sumFormula);

        // Compare results
        if (sumRecursion == sumFormula) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Results do not match! Check the logic.");
        }

        scanner.close(); // Close scanner
    }
}
