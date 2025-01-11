
import java.util.Scanner;

public class SpringSeason7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // taking input from the user
        System.out.println("Enter the month");
        int month = input.nextInt();

        // taking input from the user
        System.out.println("Enter the day");
        int day = input.nextInt();

        // the month number of march and june is 3 and 6 respectively.
        if ((month == 3 && day >= 20) ||
                (month > 3 && month < 6) ||
                (month == 6 && day <= 20)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        input.close();
    }
}

