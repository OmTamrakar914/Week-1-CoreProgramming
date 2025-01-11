// Taking kilometer input and converting it to miles

import java.util.*;

public class KilometerToMile8{
	public static void main(String []args){
		// Crating Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking  input kilometer and assigning it to a varible km;
		double km = sc.nextInt();
		
		// 1 mile = 1.6 kilometer
		double miles = km/1.6;
		
		//Printing the miles 
		System.out.println("The distance "+km+" km in miles is "+miles);
	}
}