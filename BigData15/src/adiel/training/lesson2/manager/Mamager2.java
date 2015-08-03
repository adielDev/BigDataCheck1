package adiel.training.lesson2.manager;

import java.util.Scanner;

import adiel.training.lesson2.employee.Employee2;
import adiel.training.lesson2.office.IOffice2;
import adiel.training.lesson2.office.Office2;
import adiel.training.lesson2.office.OfficeEmployee2;
import adiel.training.lesson2.trainer.ITrainer2;
import adiel.training.lesson2.trainer.Trainer2;
import adiel.training.lesson2.trainer.TrainerEmployee2;

public class Mamager2 extends Employee2 implements IManager2{

	private IOffice2 _office2;
	private ITrainer2 _trainer2;
	
	public Mamager2() {
		_office2 = new OfficeEmployee2();
		_trainer2 = new TrainerEmployee2();
	}
	
	@Override
	public void setRank(int rank) {
		
		_office2.setRank(rank);
		
	}

	@Override
	public int getRank() {
		return _office2.getRank();
	}

	@Override
	public void setHours(int hours) {
		_trainer2.setHours(hours);
	}

	@Override
	public void setHourly(int hourly) {
		_trainer2.setHourly(hourly);
		
	}

	@Override
	public int getHours() {
		return _trainer2.getHours();
	}

	@Override
	public int getHourly() {
		return _trainer2.getHourly();
	}

	@Override
	public int GetSal() {
		return _office2.GetSal()+_trainer2.GetSal();
	}

	@Override
	public void ReadConsole(Scanner scanner) {
		super.ReadConsole(scanner);
		scanner.nextLine();
		_office2.ReadConsole(scanner);
		_trainer2.ReadConsole(scanner);
	}

	@Override
	public String toString() {
		return "Mamager2 [_office2=" + _office2 + ", _trainer2=" + _trainer2
				+ "]";
	}
	
	
	
	

}
