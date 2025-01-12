// Calculating the mean height of players

import java.util.Scanner;

public class MeanHeight6{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		//declaring the array
		double mean[] = new double[11];
		
		//declaring sum variable
		double sum = 0;
		
		//taking input the heights of the students
		for(int i=0; i<11; i++){
			System.out.println("Enter the height of the player");
		    mean[i] = sc.nextInt();
		}
		
		//summing the heights
		for(int i=0; i<11; i++){
			sum += mean[i];
		}
		
		//calculating mean
		double meanheight = sum/11;
		
		System.out.println("The mean of height of the players is "+meanheight);
		
	}
}