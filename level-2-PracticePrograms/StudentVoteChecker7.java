
import java.util.Scanner;

// Class Name StudentVoteChecker
public class StudentVoteChecker7 {

    // Method Name: canStudentVote
    // Checks if a student can vote based on their age
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age, cannot vote
        }
        return age >= 18; // If age is 18 or above, student can vote
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for user input
        StudentVoteChecker7 checker = new StudentVoteChecker7(); // Object of StudentVoteChecker

        int[] ages = new int[10]; // Array to store ages of 10 students

        // Loop to take input for all 10 students
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt(); // Take age input from user

            // Call canStudentVote method and print result
            if (checker.canStudentVote(ages[i])) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        scanner.close(); // Close the scanner
    }
}

