package adiel.training.lesson1;

import java.util.HashMap;
import java.util.Scanner;

import avrahm.Lesson1.HelloWorld.Employee;

public class MyEmployeeConsolReader {

	static HashMap<Integer, String> _employeesClassesNames = null;
	
	public static void initEmployeesClassesNames (){
		
		if(_employeesClassesNames==null){
		_employeesClassesNames = new HashMap<>();
		_employeesClassesNames.put(1, OfficeEmployee.class.getName());
		_employeesClassesNames.put(2, TrainerEmployee.class.getName());
		importantInformation();
		}
	}
	
	public static void importantInformation(){
		System.out.println("for office employee press 1 ");
		System.out.println("for traineremployee press 2 ");
	}
	
	public static MyEmployee readEmployee() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		initEmployeesClassesNames();
		
		MyEmployee currentEmployee = null;
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter employee type");
		int empType = scanner.nextInt();
		Class employeeClass = Class.forName(_employeesClassesNames.get(empType));
		currentEmployee = (MyEmployee) employeeClass.newInstance();
		currentEmployee.readEmployeeDetailsFromConsol(scanner);
		
		return currentEmployee;
	}
	
}
