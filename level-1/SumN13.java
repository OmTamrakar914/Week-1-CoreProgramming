
import java.util.Scanner;

public class SumN13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // taking input from the user
        System.out.println("Enter the number:");
        int num = input.nextInt();

        if (num > 0) {

            // creating variable to store total addition
            int totalUsingLoop = 0;

            // calculating value using formula
            int totalUsingFormula = (num * (num + 1)) / 2;

            // using while calculating sum of n natural numbers
            for (int i = 1; i <= num; i++) {
                totalUsingLoop += i;
            }

            // comparing them
            String flag;
            if (totalUsingLoop == totalUsingFormula)
                flag = "same";
            else
                flag = "not same";

            // printing the output
            System.out.println(
                    "Total using for loop is " + totalUsingLoop + " and the total computed using the formula is "
                            + totalUsingFormula + ", both the sum are " + flag);

        } else {
            System.out.println("The entered number is not a natural number.");
        }

        input.close();
    }
}

