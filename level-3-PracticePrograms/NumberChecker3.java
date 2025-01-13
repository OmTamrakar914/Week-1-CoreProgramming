
import java.util.Arrays;

public class NumberChecker3 {

    // Method to count digits in a number
    public static int countDigits(int num) {
        return String.valueOf(Math.abs(num)).length();
    }

    // Method to store digits of a number in an array
    public static int[] getDigitsArray(int num) {
        String numStr = String.valueOf(Math.abs(num));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    // Method to calculate the sum of digits
    public static int sumOfDigits(int[] digits) {
        return Arrays.stream(digits).sum();
    }

    // Method to calculate the sum of squares of digits
    public static int sumOfSquares(int[] digits) {
        return Arrays.stream(digits).map(d -> (int) Math.pow(d, 2)).sum();
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshad(int num) {
        int[] digits = getDigitsArray(num);
        return num % sumOfDigits(digits) == 0;
    }

    // Method to find frequency of each digit
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int digit : digits) freq[digit][1]++;
        return freq;
    }

    public static void main(String[] args) {
        int number = 132; // Example number
        int[] digits = getDigitsArray(number);

        System.out.println("Number: " + number);
        System.out.println("Count of Digits: " + countDigits(number));
        System.out.println("Digits Array: " + Arrays.toString(digits));
        System.out.println("Sum of Digits: " + sumOfDigits(digits));
        System.out.println("Sum of Squares: " + sumOfSquares(digits));
        System.out.println("Is Harshad Number: " + isHarshad(number));
        
        System.out.println("Digit Frequency:");
        for (int[] f : digitFrequency(digits)) {
            if (f[1] > 0) System.out.println("Digit " + f[0] + ": " + f[1]);
        }
    }
}

