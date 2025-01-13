
import java.util.Arrays;

public class FootballTeamHeight1 {

    // Method to generate random heights for players
    public static int[] generateRandomHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + (int) (Math.random() * 101); // Generate random height between 150 and 250 cm
        }
        return heights;
    }

    // Method to calculate the sum of all heights
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height; // Add each height to the sum
        }
        return sum;
    }

    // Method to calculate the mean height
    public static double calculateMean(int[] heights) {
        int sum = calculateSum(heights); // Get the sum of heights
        return (double) sum / heights.length; // Calculate the mean
    }

    // Method to find the shortest height
    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            shortest = Math.min(shortest, height); // Update shortest height
        }
        return shortest;
    }

    // Method to find the tallest height
    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            tallest = Math.max(tallest, height); // Update tallest height
        }
        return tallest;
    }

    public static void main(String[] args) {
        int[] heights = generateRandomHeights(11); // Generate random heights for 11 players

        // Calculate results
        int shortest = findShortestHeight(heights);
        int tallest = findTallestHeight(heights);
        double mean = calculateMean(heights);

        // Display results
        System.out.println("Heights of players (in cm): " + Arrays.toString(heights));
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
        System.out.printf("Mean height: %.2f cm%n", mean);
    }
}

