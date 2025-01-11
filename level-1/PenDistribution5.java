// Dividing pen among three students

import java.util.*;

public class PenDistribution5{
	public static void main(String[]args){
		
		//total no. of pen is 14 and students is 3
		
		int pen = 14;
		//pen to each student
		int penPerStudent = 14 / 3;
		// remaining pen
		int penRemain = 14 % 3;
		
		System.out.println("The Pen Per Student is "+penPerStudent+" and the remaining pen not distributed is "+penRemain);
		
	}
}