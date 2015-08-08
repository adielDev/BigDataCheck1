package avrahm.Lesson3.Employee;
import java.util.Scanner;


class Manager extends Employee implements IManager {

	IOffice _office;
	ITrainer _trainer;
	public Manager(){
		_office= new Office(); 
		_trainer= new Trainer();
	}
	@Override
	public void setHours(int hours) {
		// TODO Auto-generated method stub
		_trainer.setHours(hours);
	}

	@Override
	public void setHourlySal(int hourlySal) {
		// TODO Auto-generated method stub
		_trainer.setHourlySal(hourlySal);
	}

	@Override
	public int getHourlySal() {
		// TODO Auto-generated method stub
		return _trainer.getHourlySal();
	}

	@Override
	public int getHours() {
		// TODO Auto-generated method stub
		return _trainer.getHours();
	}

	@Override
	public void setRank(int rank) {
		// TODO Auto-generated method stub
		_office.setRank(rank);
	}

	@Override
	public int getRank() {
		// TODO Auto-generated method stub
		return _office.getRank();
	}

	@Override
	public int GetSal() {
		// TODO Auto-generated method stub
		return _office.GetSal()+_trainer.GetSal(); 
	}
	@Override
	public void ReadConsole(Scanner scanner){
		super.ReadConsole(scanner);
		_trainer.ReadConsole(scanner);
		_office.ReadConsole(scanner);
	}


}
