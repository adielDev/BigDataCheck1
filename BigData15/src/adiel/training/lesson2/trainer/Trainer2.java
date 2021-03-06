package adiel.training.lesson2.trainer;

import java.util.Scanner;

public class Trainer2  implements ITrainer2{
	
	int _hours, _hourly;

	public Trainer2() {
		
	}
	
	@Override
	public void setHours(int hours) {
		_hours = hours;
	}

	@Override
	public void setHourly(int hourly) {
			_hourly = hourly;
	}

	@Override
	public int getHours() {
		return _hours;
	}

	@Override
	public int getHourly() {
		return _hours;
	}

	@Override
	public String toString() {
		return "Trainer2 [_hours=" + _hours + ", _hourly=" + _hourly + "]";
	}

	@Override
	public void ReadConsole(Scanner scanner) {
		scanner.nextLine();
		System.out.println("Enter employee hours");
		int hours=  scanner.nextInt(); 	
		setHours(hours);
		System.out.println("Enter employee hourly");
		int hourly=  scanner.nextInt(); 	
		setHourly(hourly);
		
	}

	@Override
	public int GetSal() {
		return _hourly*_hours;
	}

	
}
