import java.util.Arrays;

public class RandomValuesProcessor12 {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = 1000 + (int) (Math.random() * 9000); // Generate a 4-digit random number
        }
        return randomNumbers;
    }

    // Method to find the average, minimum, and maximum of an array
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum += num; // Calculate the sum
            min = Math.min(min, num); // Update minimum value
            max = Math.max(max, num); // Update maximum value
        }

        double avg = (double) sum / numbers.length; // Calculate average
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        // Generate an array of 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        // Calculate the average, minimum, and maximum
        double[] results = findAverageMinMax(randomNumbers);

        // Display the results
        System.out.println("Generated Random Numbers: " + Arrays.toString(randomNumbers));
        System.out.printf("Average: %.2f%n", results[0]);
        System.out.println("Minimum: " + (int) results[1]);
        System.out.println("Maximum: " + (int) results[2]);
    }
}

