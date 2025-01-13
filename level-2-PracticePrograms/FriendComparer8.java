
import java.util.Scanner;


public class FriendComparer8 {

    // Method Name: findYoungest
    // Finds the youngest friend based on age
    public String findYoungest(int[] ages) {
        int minAge = ages[0];
        String youngest = "Amar"; // Assuming Amar is the youngest initially

        // Compare ages to find the youngest
        if (ages[1] < minAge) {
            minAge = ages[1];
            youngest = "Akbar";
        }
        if (ages[2] < minAge) {
            minAge = ages[2];
            youngest = "Anthony";
        }
        return youngest;
    }

    // Method Name: findTallest
    // Finds the tallest friend based on height
    public String findTallest(double[] heights) {
        double maxHeight = heights[0];
        String tallest = "Amar"; // Assuming Amar is the tallest initially

        // Compare heights to find the tallest
        if (heights[1] > maxHeight) {
            maxHeight = heights[1];
            tallest = "Akbar";
        }
        if (heights[2] > maxHeight) {
            maxHeight = heights[2];
            tallest = "Anthony";
        }
        return tallest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for user input
        FriendComparer comparer = new FriendComparer(); // Object of FriendComparer

        int[] ages = new int[3]; // Array to store ages of 3 friends
        double[] heights = new double[3]; // Array to store heights of 3 friends

        // Loop to take input for ages and heights of 3 friends
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of ");
            if (i == 0) {
                System.out.print("Amar: ");
            } else if (i == 1) {
                System.out.print("Akbar: ");
            } else {
                System.out.print("Anthony: ");
            }
            ages[i] = scanner.nextInt(); // Take age input from user

            System.out.print("Enter height of ");
            if (i == 0) {
                System.out.print("Amar: ");
            } else if (i == 1) {
                System.out.print("Akbar: ");
            } else {
                System.out.print("Anthony: ");
            }
            heights[i] = scanner.nextDouble(); // Take height input from user
        }

        // Find and display the youngest friend
        String youngest = comparer.findYoungest(ages);
        System.out.println("The youngest friend is: " + youngest);

        // Find and display the tallest friend
        String tallest = comparer.findTallest(heights);
        System.out.println("The tallest friend is: " + tallest);

        scanner.close(); // Close the scanner
    }
}



