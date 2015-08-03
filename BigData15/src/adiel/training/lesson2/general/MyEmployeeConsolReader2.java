package adiel.training.lesson2.general;

import java.util.HashMap;
import java.util.Scanner;

import adiel.training.lesson2.employee.Employee2;
import adiel.training.lesson2.office.OfficeEmployee2;
import adiel.training.lesson2.trainer.TrainerEmployee2;

public class MyEmployeeConsolReader2 {

	static HashMap<Integer, String> _employeesClassesNames = null;
	
	public static void initEmployeesClassesNames (){
		
		if(_employeesClassesNames==null){
		_employeesClassesNames = new HashMap<>();
		_employeesClassesNames.put(1, OfficeEmployee2.class.getName());
		_employeesClassesNames.put(2, TrainerEmployee2.class.getName());
		importantInformation();
		}
	}
	
	public static void importantInformation(){
		System.out.println("for office employee press 1 ");
		System.out.println("for traineremployee press 2 ");
	}
	
	public static Employee2 readEmployee() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		initEmployeesClassesNames();
		
		Employee2 currentEmployee = null;
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter employee type");
		int empType = scanner.nextInt();
		Class employeeClass = Class.forName(_employeesClassesNames.get(empType));
		currentEmployee = (Employee2) employeeClass.newInstance();
		currentEmployee.ReadConsole(scanner);
		
		return currentEmployee;
	}
	
}
