// Taking distance input in feets and converting it in miles and yards

import java.util.*;

public class YardsAndMiles14{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		//Taking input distance in feets
		System.out.println("enter distance");
		double feets = sc.nextInt();
		
		//converting in yards
		double yards = feets/3;
		
		//converting in miles
		double miles = yards/1760;
		
		//priting the diatnace in yards and miles
		System.out.println("The distance is yards is "+yards+" and miles is "+miles);
		
       		
	}
}

