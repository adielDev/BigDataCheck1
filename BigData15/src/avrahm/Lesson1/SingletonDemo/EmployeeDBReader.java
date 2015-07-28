package avrahm.Lesson1.SingletonDemo;


public class EmployeeDBReader extends EmployeeReader {
	
	private EmployeeDBReader(){
		
	}
	@Override 
	public void PrintDemo(){
		System.out.println("Hello I am employee DBReader");
	}
}
