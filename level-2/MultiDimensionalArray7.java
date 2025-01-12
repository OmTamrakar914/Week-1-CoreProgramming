// 2D array for calculating BMI

import java.util.Scanner;


public class MultiDimensionalArray7{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		// taking number input
		 System.out.println("Enter the Number");
		 int number = sc.nextInt();
		 
		 //declaring a 2D array
		 double personData[][] = new double[number][3];
		 
         //declaring a array for weight status
         String weightStatus[] = new String[number];
		 
		 for(int i=0; i<number; i++){
			 //calculating BMI by storing height and weight 
			 System.out.println("Enter the weight");
		     personData[i][0] = sc.nextDouble();
			 
			 if(personData[i][0] <0){
				 System.out.println("please enter positive value!");
			 }
			 
			  System.out.println("Enter the height");
		     personData[i][1] = sc.nextDouble();
			 
			  if(personData[i][1] <0){
				 System.out.println("please enter positive value!");
			 }
			 
			 
			 
		     personData[i][2] = personData[i][0]/(personData[i][1]*personData[i][1]);
		   
		 }
		 
		 for(int i=0; i<number; i++){
			 if(personData[i][2] <= 18.4){
				 weightStatus[i] = "Underweight";
			 }
			 else if(personData[i][2] >= 18.4 && personData[i][2] <=24.9){
				 weightStatus[i] = "Normal";
			 }
			 else if(personData[i][2] >= 25.0 && personData[i][2] <= 39.9){
				 weightStatus[i] = "Overweight";
			 }
			 else if(personData[i][2] >= 40.0){
				  weightStatus[i] = "Obese";
			 }
			 
		 }
		 
		  System.out.println("The Person Data : ");
		 for(int i=0; i<number; i++){
			 System.out.println("The height of person is "+personData[i][0]+", height is "+personData[i][1]+", BMI is "+personData[i][2]+" and the weight status is "+weightStatus[i] );
		 }
 		 
		 
		 sc.close();
	}
}