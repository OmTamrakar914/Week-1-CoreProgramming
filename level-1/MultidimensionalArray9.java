// Converting @D array in to a 1D array

import java.util.Scanner;

public class MultidimensionalArray9{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		//taking a number input rows and columns
		System.out.println("Enter the number of Rows");
		int rows = sc.nextInt();
		
		System.out.println("Enter the number of Columns");
		int columns = sc.nextInt();
		
		//declaring a 2D array
		int array[][] = new int[rows][columns];
		
		// Taking the 2D array input
		for(int i=0; i<rows; i++){
			for(int j=0; j<columns; j++){
				array[i][j] = sc.nextInt();
			}
		}
		
		//declaring a 1D array
		int oneDarray[] = new int[rows*columns];

		//Copying the elements to the 1D array
		int index = 0;
		
		for(int i=0; i<rows; i++){
			for(int j=0; j<columns; j++){
 			 oneDarray[index] = array[i][j];
			 index++;
			}
		}
		
		sc.close();
		
	}
}