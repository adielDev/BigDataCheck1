package avrahm.Lesson3.Employee.Interfaces;
public interface IEmployeeFactory {
	IEmployee CreateTrainerEmployee();
	IEmployee CreateOfficeEmployee();
	IEmployee CreateManagerEmployee();
	IEmployee CreateCarDecorator(IEmployee employee);
	
	
}
