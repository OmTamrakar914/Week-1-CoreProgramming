import java.util.Scanner;

public class PositiveNegativeZero5 {

	// method to determine nature of number
	public int findingNature(int number) {

		if (number == 0)
			return 0;
		if (number > 0)
			return 1;
		else
			return -1;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// taking user input in number variable
		System.out.println("Enter the Number: ");
		int number = input.nextInt();

		// calculating the maximun number of rounds he can run
		PositiveNegativeZero5 obj = new PositiveNegativeZero5();
		int nature = obj.findingNature(number);

		// printing the result
		if (nature == 0) {
			System.out.println("Number is Zero.");
		} else if (nature > 0) {
			System.out.println("Number " + number + " is Positive.");
		} else if (nature < 0) {
			System.out.println("Number " + number + " is Negative.");
		}

		input.close();
	}

}