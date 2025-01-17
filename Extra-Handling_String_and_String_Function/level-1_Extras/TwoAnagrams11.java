// check two string are anagrams

 import java.util.Scanner;
public class TwoAnagrams11{
	
	//method for Removing a specific character 
	public static boolean CompareStr(String one , String second){
		
		int arr[] = new int[255];
		
		if(one.length() != second.length()) return false;
		else{
			for(int i=0; i<one.length(); i++){
				arr[one.charAt(i)]++;
				arr[second.charAt(i)]++;
			}
			
			for(int i=0; i<one.length(); i++){
				if(arr[one.charAt(i)] != arr[second.charAt(i)]){
					return false;
				}
			}
		}
	  return true;
	} 
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string 1 : ");
		String str1 = sc.next();
		
		System.out.println("Enter a string 2 : ");
		String str2 = sc.next();
		
		
	   
		
		// string ans
		boolean ans = CompareStr(str1,str2);
		if(ans)
		System.out.println("The Two String are Anagrams");
	    else
		System.out.println("The Two are not Anagrams");
		

     sc.close();		
	}
}
