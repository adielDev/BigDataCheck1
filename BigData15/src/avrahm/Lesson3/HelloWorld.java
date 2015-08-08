
package avrahm.Lesson3;

import java.util.Scanner;


import avrahm.Lesson3.Employee.Interfaces.IEmployee;



public class HelloWorld {
	public static void Sort(IEmployee []empArray,ICompareEmployee compareEmployee){
		for (int i=0;i<empArray.length;i++){
			for (int j = i+1 ;j<empArray.length;j++){
				if (compareEmployee.compare(empArray[i],empArray[j])>0){
					//Swap
					IEmployee tmp = empArray[i];
					empArray[i]= empArray[j]; 
					empArray[j] = tmp; 
				}
			}
		}
	}
	
	
	public static void PrintEmpArray(IEmployee[] empArray){
		for (int i=0;i<empArray.length;i++){
			System.out.println(empArray[i].getName());
		}
		
	}
	public static void main(String[] argv){
		IEmployee []empArray = new IEmployee[4];
		for (int i=0;i<4;i++){
			try{
				empArray[i] = EmployeeConsoleReader.ReadEmployee();
				
			}
			catch (Exception ex){
				
			}
		}
		
		
	}
	
}
