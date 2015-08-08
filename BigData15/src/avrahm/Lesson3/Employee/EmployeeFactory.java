package avrahm.Lesson3.Employee;

import avrahm.Lesson3.Employee.Interfaces.IEmployee;
import avrahm.Lesson3.Employee.Interfaces.IEmployeeFactory;

public class EmployeeFactory implements IEmployeeFactory {

	protected static IEmployeeFactory _instance; 
	protected EmployeeFactory(){
		
	}
	public static IEmployeeFactory Instance(){
		if (_instance == null){
			_instance = new EmployeeFactory();
		}
		return _instance;
	}
	
	@Override
	public IEmployee CreateTrainerEmployee() {
		// TODO Auto-generated method stub
		return new TrainerEmployee();
	}

	@Override
	public IEmployee CreateOfficeEmployee() {
		// TODO Auto-generated method stub
		return new OfficeEmployee();
	}

	@Override
	public IEmployee CreateManagerEmployee() {
		// TODO Auto-generated method stub
		return new ManagerEmployee();
	}
	@Override
	public IEmployee CreateCarDecorator(IEmployee employee) {
		// TODO Auto-generated method stub
		return new CarDecoratorEmployee(employee);
	}

}
