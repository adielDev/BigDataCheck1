package avrahm.Lesson3.Employee;
import java.util.Scanner;


class Trainer implements ITrainer {
	int _hours,_hourlySal;
	@Override
	public void ReadConsole(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("Enter employee hours");
		_hours = scanner.nextInt();
		System.out.println("Enter employee hourly sal");
		_hourlySal = scanner.nextInt();
	}

	@Override
	public int GetSal() {
		// TODO Auto-generated method stub
		return _hours * _hourlySal; 
	}

	@Override
	public void setHours(int hours) {
		// TODO Auto-generated method stub
		_hours = hours; 
	}

	@Override
	public void setHourlySal(int hourlySal) {
		// TODO Auto-generated method stub
		_hourlySal = hourlySal; 
	}

	@Override
	public int getHourlySal() {
		// TODO Auto-generated method stub
		return _hourlySal ;
	}

	@Override
	public int getHours() {
		// TODO Auto-generated method stub
		return _hours;
	}

}
