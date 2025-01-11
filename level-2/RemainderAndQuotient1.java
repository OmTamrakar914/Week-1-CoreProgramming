import java.util.Scanner;

public class RemainderAndQuotient1 {

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      // taking input of first number
      System.out.println("Enter the first number");
      int first = input.nextInt();

      // taking input of second number
      System.out.println("Enter the second number");
      int second = input.nextInt();

      // Calculate the quotient and remainder
      int quotient = first / second;
      int remainder = first % second;

      // display the result
      System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two numbers " + first
            + " and " + second);

      input.close();

   }
}