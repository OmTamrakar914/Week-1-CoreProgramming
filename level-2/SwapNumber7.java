import java.util.Scanner;

public class SwapNumber7 {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
       // taking input of first number
      System.out.println("Enter the first number");
      int number1 = input.nextInt();

      // taking input of second number
      System.out.println("Enter the second number");
      int number2 = input.nextInt();

      //swapping two number using third variable
      int temp = number1;
      number1 = number2;
      number2 = temp;

      //printin the result
      System.out.println("The swapped numbers are "+ number1 +" and " + number2);

        input.close();
    }  
}