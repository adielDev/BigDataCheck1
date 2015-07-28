package avrahm.Lesson1.SingletonDemo;


public class mainProg {
	public static void main(String[] argv){
		EmployeeReader emp = EmployeeReader.Instance(); 
		emp.PrintDemo();
	
	}
}
