package avrahm.Lesson3;


import java.util.HashMap;
import java.util.Scanner;

import avrahm.Lesson2.ITrainerEmployee;
import avrahm.Lesson3.Employee.EmployeeFactory;
import avrahm.Lesson3.Employee.Interfaces.IEmployee;
import avrahm.Lesson3.Employee.Interfaces.IEmployeeFactory;
import avrahm.Lesson3.Employee.Interfaces.IOfficeEmployee;





public  class EmployeeConsoleReader {
	
	private static HashMap<Integer, String> _employeesClassNames = null; 
	
	
	
	private EmployeeConsoleReader(){
		
		
	}
	public static void InitEmployeeClasses(){
		if (_employeesClassNames == null){
			_employeesClassNames = new  HashMap<Integer, String>();
			_employeesClassNames.put(1, IOfficeEmployee.class.getName());
			_employeesClassNames.put(2, ITrainerEmployee.class.getName());
			;
			
		}
	}
	public static IEmployee ReadEmployeewithDecorator() throws Exception{
		
		IEmployee emp = ReadEmployee();
		Scanner scanner = new Scanner(System.in);
		IEmployeeFactory employeeFactory = EmployeeFactory.Instance();  
		System.out.println("user has car?");
		int car = scanner.nextInt();
		if (car==1){
			emp = employeeFactory.CreateCarDecorator(emp); 
		}
		
		
		return emp;
	}
	public static IEmployee ReadEmployee() throws Exception{
		InitEmployeeClasses();
		IEmployee retVal = null; 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter employee type");
		int empType = scanner.nextInt(); 
		IEmployeeFactory employeeFactory = EmployeeFactory.Instance();  
		switch (empType){
		case 1:
			
			retVal = employeeFactory .CreateOfficeEmployee(); 
			break;
		case 2:
			retVal = employeeFactory .CreateTrainerEmployee(); 
			break;
		case 3:
			retVal = employeeFactory .CreateManagerEmployee();
		}
		
		
		retVal.ReadConsole(scanner);
		
		return retVal;
		
	
	}
	
}
