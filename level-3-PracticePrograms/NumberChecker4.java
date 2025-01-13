
import java.util.Arrays;

public class NumberChecker4 {

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

    // Method to reverse the digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int[] digits = getDigitsArray(num);
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int num) {
        int[] digits = getDigitsArray(num);
        for (int i = 1; i < digits.length; i++) { // Start from index 1 to ignore leading zero
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 12321; // Example number
        int[] digits = getDigitsArray(number);

        System.out.println("Number: " + number);
        System.out.println("Count of Digits: " + countDigits(number));
        System.out.println("Digits Array: " + Arrays.toString(digits));
        System.out.println("Reversed Array: " + Arrays.toString(reverseArray(digits)));
        System.out.println("Is Palindrome: " + isPalindrome(number));
        System.out.println("Is Duck Number: " + isDuckNumber(number));
    }
}

