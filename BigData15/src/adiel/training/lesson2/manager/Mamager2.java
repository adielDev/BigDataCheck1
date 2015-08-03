package adiel.training.lesson2.manager;

import adiel.training.lesson2.employee.Employee2;
import adiel.training.lesson2.office.IOffice2;
import adiel.training.lesson2.office.Office2;
import adiel.training.lesson2.trainer.ITrainer2;
import adiel.training.lesson2.trainer.Trainer2;

public class Mamager2 extends Employee2 implements IManager2{

	private IOffice2 _office2;
	private ITrainer2 _trainer2;
	
	public Mamager2() {
		_office2 = new Office2();
		_trainer2 = new Trainer2();
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
		return 0;
	}
	
	

}
