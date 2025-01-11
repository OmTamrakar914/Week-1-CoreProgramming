import java.util.Scanner;

public class TotalIncome6 {
      public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        //taking user input in salary variable
        System.out.println("Enter the Salary");
        double salary = input.nextDouble();

        //taking user input in bonus variable
        System.out.println("Enter the bonus");
        double bonus = input.nextDouble();

        //calculating the total income of user
        double totalIncome = salary + bonus;

        //printing the output
        System.out.println("The salary is INR " +salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " +totalIncome+ ".");;

        input.close();
    }   
}