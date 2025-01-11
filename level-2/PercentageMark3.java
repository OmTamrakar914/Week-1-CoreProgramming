import java.util.Scanner;

public class PercentageMark3{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // taking in put from user
        System.out.print("Enter a marks of student in physics: ");
        double physics = input.nextDouble();

        // taking in put from user
        System.out.print("Enter a marks of student in physics: ");
        double chemistry = input.nextDouble();

        // taking in put from user
        System.out.print("Enter a marks of student in physics: ");
        double math = input.nextDouble();

       // calculating percentage of user
        double total = physics + chemistry + math;
        double percentage = total/3;

        //determining the grade of user
        if(percentage >= 80){
           System.out.println("The Percentage of student is " + percentage + ", and the grade of student is A.");
       }else if(percentage >= 70){
            System.out.println("The Percentage of student is " + percentage + ", and the grade of student is B.");
       }else if(percentage >= 60){
             System.out.println("The Percentage of student is " + percentage + ", and the grade of student is C.");
       }else if(percentage >= 50){
             System.out.println("The Percentage of student is " + percentage + ", and the grade of student is D.");
       }else if(percentage >= 40){
             System.out.println("The Percentage of student is " + percentage + ", and the grade of student is E.");
       }else{
            System.out.println("The Percentage of student is " + percentage + ", and the grade of student is R.");
       }

        input.close();
    }
}