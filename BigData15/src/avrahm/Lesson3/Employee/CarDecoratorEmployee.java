package avrahm.Lesson3.Employee;

import java.util.Scanner;

import avrahm.Lesson3.Employee.Interfaces.ICarDecoratorEmployee;
import avrahm.Lesson3.Employee.Interfaces.IEmployee;



public class CarDecoratorEmployee extends Employee implements ICarDecoratorEmployee,
		ICarDecorator {

	ICarDecorator _carDecorator; 
	public CarDecoratorEmployee(IEmployee employee){
		_carDecorator = new CarDecorator((IEmpType)employee);
	}
	@Override
	public void ReadConsole(Scanner scanner) {
		// TODO Auto-generated method stub
		super.ReadConsole(scanner);
		_carDecorator.ReadConsole(scanner);
		
	}

	@Override
	public int GetSal() {
		// TODO Auto-generated method stub
		return 0;
	}

}
