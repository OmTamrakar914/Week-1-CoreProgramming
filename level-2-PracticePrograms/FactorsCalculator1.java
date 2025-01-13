// finding the factors of a number, calculates their sum, product, and sum of squares.

import java.util.Scanner;

public class FactorsCalculator1 {

    // Method to find and return an array of factors of a given number
    public static int[] findFactors(int num) {
        // First loop to count the number of factors
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        // Initialize the array to store factors
        int[] factors = new int[count];
        int index = 0;

        // Second loop to store factors in the array
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to calculate the sum of the factors
    public static int getSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to calculate the product of the factors
    public static long getProductOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to calculate the sum of squares of the factors
    public static int getSumOfSquares(int[] factors) {
        int sumSquares = 0;
        for (int factor : factors) {
            sumSquares += Math.pow(factor, 2);
        }
        return sumSquares;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number from user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num <= 0) {
            System.out.println("Invalid input! Please enter a positive number.");
        } else {
            // Find factors and store them in an array
            int[] factors = findFactors(num);

            // Calculate results
            int sumFactors = getSumOfFactors(factors);
            long productFactors = getProductOfFactors(factors);
            int sumSquaresFactors = getSumOfSquares(factors);

            // Display results
            System.out.println("Factors of " + num + ":");
            for (int factor : factors) {
                System.out.print(factor + " ");
            }
            System.out.println("\nSum of Factors: " + sumFactors);
            System.out.println("Product of Factors: " + productFactors);
            System.out.println("Sum of Squares of Factors: " + sumSquaresFactors);
        }

        scanner.close(); // Close the scanner
    }
}