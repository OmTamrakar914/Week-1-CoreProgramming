import java.util.Scanner;

public class IntOperation2 {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        // Take input from the user in variable a, b, c.
        System.out.print("Enter value for a: ");
        int a = input.nextInt();
        
        System.out.print("Enter value for b: ");
        int b = input.nextInt();
        
        System.out.print("Enter value for c: ");
        int c = input.nextInt();
        
        // Calculating the values
        int result1 = a + b * c;        // a + (b * c)
        int result2 = a * b + c;        // (a * b) + c
        int result3 = c + a / b;        // c + (a / b)
        int result4 = a % b + c;        // (a % b) + c
        
        // Printing the results
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4 + ".");
        
        
        input.close();
    }
}