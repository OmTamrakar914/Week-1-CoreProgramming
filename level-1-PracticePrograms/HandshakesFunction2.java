import java.util.Scanner;

public class HandshakesFunction2{
	
	//method to calculate maximum number of handshakes
	public int calculateHandshakes(int students){
		
		int maxH;
		maxH = (students * (students - 1)) /2;
		return maxH;
		
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//taking user input in students variable
		System.out.println("Enter the number of students: ");
		int students = input.nextInt();
		
		//calculating maximun number of Handshakes
		HandshakesFunction2 obj=new HandshakesFunction2();
		int handshakes=obj.calculateHandshakes(students);
		
		//printing the result
		System.out.println("The maximun number of handshakes among " + students + " is " + handshakes + ".");
		
		
		
		input.close();
	}
	
}