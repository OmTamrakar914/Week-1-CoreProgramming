import java.util.Scanner;

public class SmallestAndLargest8 {

    // method to find smallest and largest number from three number
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {

        // creating array of size 2 to store smallest and largest number
        int arr[] = new int[2]; // arr[0]=smallest arr[1]=largest

        // finding the smallest number
        if (number1 < number2 && number1 < number3) {
            arr[0] = number1;
        } else if (number2 < number1 && number2 < number3) {
            arr[0] = number2;
        } else {
            arr[0] = number3;
        }

        // finding the largest number
        if (number1 > number2 && number1 > number3) {
            arr[1] = number1;
        } else if (number2 > number1 && number2 > number3) {
            arr[1] = number2;
        } else {
            arr[1] = number3;
        }

        return arr;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // taking user input in number1 variable
        System.out.println("Enter the first Number: ");
        int number1 = input.nextInt();

        // taking user input in number2 variable
        System.out.println("Enter the second Number: ");
        int number2 = input.nextInt();

        // taking user input in number3 variable
        System.out.println("Enter the third Number: ");
        int number3 = input.nextInt();

        // finding the smallest and the largest among three numbers
        int[] arr = findSmallestAndLargest(number1, number2, number3);

        // printing the output
        System.out.println("The smallest number is: " + arr[0]);
        System.out.println("The largest number is: " + arr[1]);

        input.close();
    }
}