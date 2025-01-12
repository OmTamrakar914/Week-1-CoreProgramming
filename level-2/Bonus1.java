// Calculating the bonus and new Salary of employees

import java.util.Scanner;

public class Bonus1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		//declaring array for storing salary and years of service
		double salary[] = new double[10];
		double service[] = new double[10];
		
		// taking input from the user
		double validsalary = 1;
		double validservice = 1;
		for(int i=0; i<10; i++){
			//taking a number input salary and years of service
	 	System.out.println("Enter the salary");
		validsalary = sc.nextDouble();
		
		System.out.println("Enter the years of serivce");
		validservice = sc.nextDouble();
		
		if(validsalary <= 0 || validservice <=0){
			System.out.println("Invalid salary or years of serivce, Please enter again!");
			i--;
		 }else{
			 salary[i] = validsalary;
			 service[i] = validservice;
		 }
		}
		
		// declaring total bonus, total old salary, and total new salary
       double totalBonus = 0;
       double totalOldSalary = 0;
       double totalNewSalary = 0;
	   
	   //declaring new salary array and bonus array
	   double newSalary[] = new double[10];
	   double bonus[] = new double[10];
	   
	   //declaring a emoloyeeBonus variable
	   double employeeBonus = 0;

       // calculating bonus of emoloyees
       for(int i=0; i<10; i++){
		   if(service[i] > 5 ){
			   employeeBonus = salary[i]*5/100;
               		
		   }
		   else if(service[i] < 5){
			   employeeBonus = salary[i]*2/100;
		   }
		   
		        bonus[i] = employeeBonus;
                newSalary[i] = salary[i] + employeeBonus;
				
		   // calculating total's old, new , bonus
                totalBonus += employeeBonus;
                totalOldSalary += salary[i];
                totalNewSalary += newSalary[i];	
	   }	   
		
		// printing the salary and bonus
		System.out.println("Employees Salaries and bonus");
		for(int i=0; i<10; i++){
			System.out.println("Employee "+ (i+1)+" old salary is "+salary[i]+" and new salary is "+newSalary[i]+", bonus employee received "+bonus[i]);
		}
		
		// displaying total salaries
		System.out.println("The Total Old salary of all employees is "+totalOldSalary);
		System.out.println("The Total New salary of all employees is "+totalNewSalary);
		System.out.println("The Total Bonus of all employees is "+totalBonus);
		
	}
}