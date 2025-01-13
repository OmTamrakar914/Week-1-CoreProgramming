
import java.util.Scanner;

public class Quadratic11 {

    // Method to find the roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c; // Calculate delta (discriminant)

        if (delta > 0) {
            // Two distinct roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            // One root
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            // Delta is negative; no real roots
            return new double[0]; // Return an empty array
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values for the coefficients
        System.out.print("Enter the coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter the coefficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter the constant c: ");
        double c = sc.nextDouble();

        // Find the roots using the method
        double[] roots = findRoots(a, b, c);

        // Display the result
        if (roots.length == 2) {
            System.out.printf("The equation has two roots: %.2f and %.2f%n", roots[0], roots[1]);
        } else if (roots.length == 1) {
            System.out.printf("The equation has one root: %.2f%n", roots[0]);
        } else {
            System.out.println("The equation has no real roots.");
        }

        sc.close(); // Close the Scanner
    }
}

