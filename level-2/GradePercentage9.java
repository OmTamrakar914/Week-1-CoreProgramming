// grades and percentage using 2D array

// Calculating and percentage and grade

import java.util.Scanner;


public class GradePercentage9{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		// taking number input
		 System.out.println("Enter the Number of students");
		 int number = sc.nextInt();
		 
		 //declaring 2array for physics, chemistry and maths
		 int marks[][] = new int[number][3];
		 
		 //declaring  the arrays for percentage and grades
		 
		 int percentage[] = new int[number];
		 String grade[] = new String[number];
		 
		 for(int i=0; i<number; i++){
			 System.out.println("Enter your physics marks :");
			 marks[i][0] = sc.nextInt();
			 
			 if(marks[i][0]  < 0){
				 while(marks[i][0]  < 0){
					 System.out.println("Please enter positive value!");
					 marks[i][0]  = sc.nextInt();
				 }
			 }
			 
			  System.out.println("Enter your chemistry marks :");
			 marks[i][1]  = sc.nextInt();
			 
			 if(marks[i][1]  < 0){
				  while(marks[i][1]  < 0){
					 System.out.println("Please enter positive value!");
					 marks[i][1]  = sc.nextInt();
				 }
			 }
			 
			  System.out.println("Enter your maths marks :");
			marks[i][2]  = sc.nextInt();
			 
			 if(marks[i][2] < 0){
				 while(marks[i][2] < 0){
					 System.out.println("Please enter positive value!");
					 marks[i][2] = sc.nextInt();
				 }
			 }
			 
		 }
		 
		 // calculating the percentage and grade
		 for(int i=0; i<number; i++){
			 percentage[i] = (marks[i][0]+marks[i][1]+marks[i][2])/3;
			 if(percentage[i] >= 80){
				 grade[i] = "A";
			 }
			 else if(percentage[i] >= 70 && percentage[i] <= 79){
				 grade[i] = "B";
			 }
			 else if(percentage[i] >= 60 && percentage[i] <= 69){
				 grade[i] = "C";
			 }
			 else if(percentage[i] >= 50 && percentage[i] <= 59){
				 grade[i] = "D";
			 }
			 else if(percentage[i] >= 40 && percentage[i] <= 49){
				 grade[i] = "E";
			 }
			 else if(percentage[i] <= 39){
				 grade[i] = "R";
			 }
		 }
		 
		 //printing the data
		 for(int i=0; i<number; i++){
			 System.out.println("The students marks in physics: "+marks[i][0]+", in chemistry : "+marks[i][1]+", in maths: "+marks[i][2]+" and his percentage is "+percentage[i]+" and grade is "+grade[i]);
		 }
		 
    sc.close();		 
	}
}

