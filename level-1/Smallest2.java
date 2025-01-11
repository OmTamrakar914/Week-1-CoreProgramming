import java.util.Scanner;

public class Smallest2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // taking input from the user
        System.out.println("Enter the first number:");
        int number1 = input.nextInt();

        // taking input from the user
        System.out.println("Enter the second number:");
        int number2 = input.nextInt();

        // taking input from the user
        System.out.println("Enter the third number:");
        int number3 = input.nextInt();

        // determining whether the first number is smallest or not
        if (number1 <= number2 && number1 <= number3) {
            System.out.println("Is the first number the smallest? Yes");
        } else {
            System.out.println("Is the first number the smallest? No");
        }

        input.close();
    }
}

