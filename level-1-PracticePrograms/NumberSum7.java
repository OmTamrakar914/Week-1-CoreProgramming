import java.util.Scanner;

public class NumberSum7 {

    // method to find the sum of n natural numbers
    public int findSum(int number) {
        // calculating sum using formula
        int sum = (number * (number - 1)) / 2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // taking user input in number variable
        System.out.println("Enter the natural Number: ");
        int number = input.nextInt();
        while (true) {
            if (number <= 0) {
                System.out.println("Invalid Input, enter the natural number:");
                number = input.nextInt();
            } else {
                break;
            }
        }

        // calculating sum of n natural number
        NumberSum7 obj = new NumberSum7();
        int sum = obj.findSum(number);

        // printing the output
        System.out.println("The sum of " + number + " natural number is: " + sum);

        input.close();
    }

}