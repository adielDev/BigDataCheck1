package adiel.training.lesson1;

import java.util.Scanner;

public class TrainerEmployee  extends MyEmployee{
	
	int _hours , _hourly;

	
	
	public TrainerEmployee() {
		super();
	}

	@Override
	public int getSal() {
		// TODO Auto-generated method stub
		return _hourly*_hours;
	}

	public TrainerEmployee(int _hours, int _hourly) {
		this._hours = _hours;
		this._hourly = _hourly;
	}

	@Override
	public void readEmployeeDetailsFromConsol(Scanner scaanner) {
		// TODO Auto-generated method stub
		super.readEmployeeDetailsFromConsol(scaanner);
		scaanner.nextLine();
		System.out.println("enter employee hours ");
		_hours = scaanner.nextInt();
		System.out.println("enter employee hourly sal ");
		_hourly = scaanner.nextInt();
	

	}

	@Override
	public String toString() {
		return "TrainerEmployee [_hours=" + _hours + ", _hourly=" + _hourly
				+ "]";
	}

	
	

}
