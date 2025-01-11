import java.util.Scanner;



public class ChocolateDistribution10 {

    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);



        // taking input of number Of chocolates

        System.out.println("Enter the number Of chocolates");

        int numberOfchocolates = input.nextInt();



        // taking input of number Of Children

        System.out.println("Enter the number Of Children");

        int numberOfChildren = input.nextInt();



        //calculating the distribution of chocolates among children

        int distributedChoco = numberOfchocolates / numberOfChildren ;

        

        //calculating the remaining number of chocolates 

        int remainingChoco = numberOfchocolates % numberOfChildren ;





        // printing the output

        System.out.println("The number of chocolates each child gets is " + distributedChoco + " and the number of remaining chocolates is "+ remainingChoco + "." );



        input.close();

    }

}