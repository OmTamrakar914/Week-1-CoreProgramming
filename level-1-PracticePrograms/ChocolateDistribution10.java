import java.util.Scanner;

public class ChocolateDistribution10 {

    // method to find the quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        // declaring an array to store the quotient and remainder
        int arr[] = new int[2]; // arr[0]=remainder, arr[1]=quotient
        arr[0] = number % divisor;
        arr[1] = number / divisor;

        return arr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // taking user input in numberOfChildren variable
        System.out.println("Enter the Number of Children: ");
        int numberOfChildren = input.nextInt();

        // taking user input in numberOfchocolates variable
        System.out.println("Enter the Number of Chocolates: ");
        int numberOfchocolates = input.nextInt();

        // calculating the quotient and Ramainder
        int arr[] = findRemainderAndQuotient(numberOfChildren, numberOfchocolates);

        // printing ht output
        System.out.println("Each children will get " + arr[1] + " chocolates");
        System.out.println("Remaining chocolates: " + arr[0]);

        input.close();

    }
}