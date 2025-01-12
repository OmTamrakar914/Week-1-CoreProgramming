// Checking a student can vote or not using array

import java.util.Scanner;

public class StudentVote1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //creating an array of size 10
		int vote[] = new int[10];
		
		//looping through the ages and taking input
		for(int i=0; i<10; i++){
			System.out.println("Enter the age of student");
			vote[i] = sc.nextInt();
		}
		
		//checking that they can vote or note
		for(int i=0; i<10; i++){
			if(vote[i]>=18){
				System.out.println("The student with the age "+vote[i]+" can vote" );
			}
			else{
				System.out.println("The student with the age "+vote[i]+" cannot vote" );
			}
		}
		
        
		
	}
}