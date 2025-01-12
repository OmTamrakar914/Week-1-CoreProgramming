// Calculating and percentage and grade

import java.util.Scanner;


public class GradePercentage8{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		// taking number input
		 System.out.println("Enter the Number of students");
		 int number = sc.nextInt();
		 
		 //declaring array for physics, chemistry and maths
		 int physics[] = new int[number];
		 int chemistry[] = new int[number];
		 int maths[] = new int[number];
		 
		 //declaring the arrays for percentage and grades
		 
		 int percentage[] = new int[number];
		 String grade[] = new String[number];
		 
		 for(int i=0; i<number; i++){
			 System.out.println("Enter your physics marks :");
			 physics[i] = sc.nextInt();
			 
			 if(physics[i] < 0){
				 while(physics[i] < 0){
					 System.out.println("Please enter positive value!");
					 physics[i] = sc.nextInt();
				 }
			 }
			 
			  System.out.println("Enter your chemistry marks :");
			 chemistry[i] = sc.nextInt();
			 
			 if(chemistry[i] < 0){
				  while(chemistry[i] < 0){
					 System.out.println("Please enter positive value!");
					 chemistry[i] = sc.nextInt();
				 }
			 }
			 
			  System.out.println("Enter your maths marks :");
			 maths[i] = sc.nextInt();
			 
			 if(maths[i] < 0){
				 while(maths[i] < 0){
					 System.out.println("Please enterpositive value!");
					 maths[i] = sc.nextInt();
				 }
			 }
			 
		 }
		 
		 // calculating the percentage and grade
		 for(int i=0; i<number; i++){
			 percentage[i] = (physics[i]+chemistry[i]+maths[i])/3;
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
			 System.out.println("The students marks in physics: "+physics[i]+", in chemistry : "+chemistry[i]+", in maths: "+maths[i]+" and his percentage is "+percentage[i]+" and grade is "+grade[i]);
		 }
		 
    sc.close();		 
	}
}

