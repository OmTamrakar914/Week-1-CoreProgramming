// Finding the youngest and tallest among three friends

import java.util.Scanner;

public class YoungestAndTallest2{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		//declaring the age and height array
		int age[] = new int[3];
		int height[] = new int[3];
		
		//taking input the ages of the friends
		   System.out.println("Enter the ages of friends");
		for(int i=0; i<3; i++){
			age[i] = sc.nextInt();
		}
		
		//taking input the height of the friends
		   System.out.println("Enter the height of friends");
		for(int i=0; i<3; i++){
			height[i] = sc.nextInt();
		}
		// declaring the variable for tallest and youngest
		int tallest = Integer.MIN_VALUE;
		int youngest = Integer.MAX_VALUE;
		// declaring the variable for tallest and youngest Persons
		int youngestPerson = 0;
		int tallestPerson = 0;
		
		for(int i=0; i<3; i++){
			if(youngest > age[i]){
				youngest = age[i];
				youngestPerson = i;
				
			}
			if(tallest < height[i]){
				tallest = height[i];
				tallestPerson = i;
			}
		}
		
		if(youngestPerson == 0){
			System.out.println("The Youngest friend is Amar with age "+youngest);
		}
		if(youngestPerson == 1){
			System.out.println("The Youngest friend is Akbar with age "+youngest);
		}
		if(youngestPerson == 2){
			System.out.println("The Youngest friend is Anthony with age "+youngest);
		}
		if(tallestPerson == 0){
			System.out.println("The Tallest friend is Amar with age "+tallest);
		}
		if(tallestPerson == 1){
			System.out.println("The Tallest friend is Akbar with age "+tallest);
		}
		if(tallestPerson == 2){
			System.out.println("The Tallest friend is Anthony with age "+tallest);
		}
		
		
		
	}
}