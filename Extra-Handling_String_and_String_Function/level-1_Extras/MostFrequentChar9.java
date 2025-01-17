// finding the most frequent character


import java.util.Scanner;
public class MostFrequentChar9{
	
	//method for finding the most frequent character
	public static char findFrequent(String str){
		
		int fre[] = new int[255];
		char mostFrequentChar = str.charAt(0);
		int mostFrequent = 0;
		
		for(int i=0; i<str.length(); i++){
			fre[str.charAt(i)]++;
			
			if(mostFrequent < fre[str.charAt(i)]){
				mostFrequent = fre[str.charAt(i)];
				mostFrequentChar = str.charAt(i);
			}
			
		}
		return mostFrequentChar;
	}
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		String str = sc.next();
		
		char c = findFrequent(str);
		System.out.println("The most Frequent charcter in the string "+str+" is "+c);

     sc.close();		
	}
}