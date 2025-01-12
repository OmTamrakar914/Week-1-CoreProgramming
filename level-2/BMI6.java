// Calculating BMI of a Person

import java.util.Scanner;

public class BMI6{
	public static void main(String[]args){
		//Scanner class
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of persons");
		int number = sc.nextInt();

		//declaring weight array and height array and BMI array and weight status array

		double height[] = new double[number];
		double weight[] = new double[number];
		double bmi[] = new double[number];
		String status[] = new String[number];

		//Taking height input
		System.out.println("Enter the height");
      
        for(int i=0; i<number; i++){
			 height[i] = sc.nextDouble();
		}
		
		//Taking the weight input
		System.out.println("Enter the weight");
		
		for(int i=0; i<number; i++){
			 weight[i] = sc.nextDouble();
		}

		//Calculating the bmi and storing in the array
		for(int i=0; i<number; i++){
			 bmi[i] = weight[i]/(height[i]*height[i]);
		}
		
		
		//Determining the weight status of the person based on the BMI
		for(int i=0; i<number; i++){
			if(bmi[i] <= 18.4){
				status[i] = "Underweight";
			}
			else if(bmi[i] > 18.4 && bmi[i] <= 24.9){
				status[i] = "Normal";
			}
			else if(bmi[i] > 24.9 && bmi[i] <= 39.9){
				status[i] = "Overweight";
			}
			else if(bmi[i] >= 40.0){
				status[i] = "Obese"; 
			}
		}

		for(int i=0; i<number; i++){
			System.out.println("The Height of the person is"+ height[i]+", weight is "+weight[i]+", BMI is "+bmi[i]+" and weight status is "+status[i]);
		}
		
	}
}