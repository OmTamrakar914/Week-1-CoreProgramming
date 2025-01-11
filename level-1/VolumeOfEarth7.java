// Calculating the Volume of Earth

import java.util.*;

public class VolumeOfEarth7{
	public static void main(String []args){
		// assigning Earth's radius to a variable radius
		double radius = 6378;
		
		//Earth's volume is equal to the volume of sphere 4/3 *pi*r^3
		//using Math.pow function to calculate power
		
		double volumeinKM = 4/3 * 3.14 * Math.pow(radius,3); 
		
		// Converting km to miles
		// 1km = 1.6 miles
		// asigning radius of Earth in miles to a varible radiusMiles
		
		double radiusMiles = radius * 1.6 ;
		
		// Calculating volume in miles 
		double volumeinMiles = 4/3 * 3.14 *Math.pow(radiusMiles,3);
		
		//Priting the volumes
		System.out.println("The Volume of earth in cubic kilometers is "+volumeinKM+" and cubic miles is "+volumeinMiles);
		
		
	}
}