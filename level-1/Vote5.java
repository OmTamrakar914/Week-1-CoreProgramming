import java.util.Scanner;

public class Vote5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // taking input from the user
        System.out.println("Enter the age of a person:");
        int age = input.nextInt();

        // determine whether the person is eligible for vote or not
        if (age >= 18) {
            System.out.println("The persons's age is " + age + " and he can vote.");
        } else {
            System.out.println("The persons's age is " + age + " and he cannot vote.");
        }

        input.close();
    }
}

