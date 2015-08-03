package adiel.training.lesson2.trainer;

import java.util.Scanner;

import adiel.training.lesson2.employee.Employee2;

public class TrainerEmployee2 extends Employee2 implements ITrainer2{

	ITrainer2 _trainer;
	
	public  TrainerEmployee2() {
		_trainer = new Trainer2();
	}
	
	@Override
	public void setHours(int hours) {
		_trainer.setHours(hours);
	}

	@Override
	public void setHourly(int hourly) {
		_trainer.setHourly(hourly);
	}

	@Override
	public int getHours() {
		return _trainer.getHours();
	}

	@Override
	public int getHourly() {
		return _trainer.getHourly();
	}

	@Override
	public int GetSal() {
		return _trainer.getHourly()*_trainer.getHours();
	}

	@Override
	public void ReadConsole(Scanner scanner) {
		super.ReadConsole(scanner);
		scanner.nextLine();
		System.out.println("Enter employee hours");
		int hours=  scanner.nextInt(); 	
		_trainer.setHours(hours);
		System.out.println("Enter employee hourly");
		int hourly=  scanner.nextInt(); 	
		_trainer.setHourly(hourly);
		
	}

	@Override
	public String toString() {
		return "TrainerEmployee2 [_trainer=" + _trainer + "]";
	}
	
	

}
