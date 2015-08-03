package adiel.training.lesson2.employee;

import java.util.Scanner;

public abstract class Employee2 implements IEmployee2 {
	
	protected String _name;
	
	
	@Override
	public void setName(String name) {
		_name = name;
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public  abstract int GetSal() ;
	
	@Override
	public void ReadConsole(Scanner scanner) {
		System.out.println("Enter employee name");
		_name = scanner.nextLine(); 		
	}

}
