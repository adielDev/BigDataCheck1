package adiel.training.lesson2.general;

import adiel.training.lesson1.MyEmployee;
import adiel.training.lesson1.MyEmployeeConsolReader;
import adiel.training.lesson2.employee.Employee2;

public class Main2 {

	public static void main(String[] args) {
		int numOfEmployees = 3;
		Employee2 [] myEmployees = new Employee2[numOfEmployees];
		for (int i = 0; i < myEmployees.length; i++) {
			
			try {
				myEmployees[i] = MyEmployeeConsolReader2.readEmployee();
			} catch (ClassNotFoundException | InstantiationException
					| IllegalAccessException e) {
				// TODO Auto-generated catch block
			//	System.out.println("exception");
				e.printStackTrace();
			}
		}
		
		for (int i = 0; i < myEmployees.length; i++) {
			System.out.println(myEmployees[i]);
		}
		
	}
}
