package adiel.training.lesson1;

import java.util.Scanner;

public abstract class MyEmployee {

	
	static String _name;

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}
	
	abstract  public int getSal();
	
	public  void readEmployeeDetailsFromConsol(Scanner scaanner){
		
		System.out.println("enter employee name ");
		
		_name = scaanner.nextLine();
		
	}
}
