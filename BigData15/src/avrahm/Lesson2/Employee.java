package avrahm.Lesson2;

import java.util.Scanner;



abstract public class Employee implements IEmployee{
	private String _name;
	@Override
	public String getName(){
		return _name; 
	}
	@Override
	public void setName(String name){
		_name = name; 
	}
	@Override
	abstract public int GetSal(); 
	@Override
	public void ReadConsole(Scanner scanner){
		System.out.println("Enter employee name");
		_name = scanner.nextLine(); 
	}
	
}
