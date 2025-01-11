import java.util.Scanner;

public class PositiveNegitiveZero6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // taking input from the user
        System.out.println("Enter the number");
        int number = input.nextInt();

        // determine whether the person is eligible for vote or not
        if (number > 0) {
            System.out.println("Number is Positive");
        } else if (number < 0) {
            System.out.println("Number is Negative");
        } else {
            System.out.println("Number is Zero");
        }

        input.close();
    }
}