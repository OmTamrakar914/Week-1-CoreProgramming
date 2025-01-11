// Finding the maximum possible handshakes

import java.util.*;

public class MaxHandshake16{
	public static void  main (String []args){
		Scanner sc = new Scanner(System.in);
		
		//taking input the no. of students
		System.out.println("enter no. of students");
		int n = sc.nextInt();
		
		//calculating the handshakes
		int handshakes = (n*(n-1))/2;
		
		//printing the answer
		System.out.println("The Total number of possible handshakes will be "+handshakes);
	}
}