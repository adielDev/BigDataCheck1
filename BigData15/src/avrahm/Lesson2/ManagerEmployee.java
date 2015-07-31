package avrahm.Lesson2;
import java.util.Scanner;


public class ManagerEmployee extends Employee implements IManagerEmployee{
	IOfficeEmployee _officeEmployee;
	ITrainer _trainer;
	
	public ManagerEmployee(){
		_officeEmployee = new OfficeEmployee(); 
		_trainer= new Trainer();
	}
	@Override
	public void setHours(int hours) {
		// TODO Auto-generated method stub
		_trainerEmployee.setHours(hours);
	}

	@Override
	public void setHourlySal(int hourlySal) {
		// TODO Auto-generated method stub
		_trainerEmployee.setHourlySal(hourlySal);
	}

	@Override
	public int getHourlySal() {
		// TODO Auto-generated method stub
		return _trainerEmployee.getHourlySal();
	}

	@Override
	public int getHours() {
		// TODO Auto-generated method stub
		return _trainerEmployee.getHours();
	}

	@Override
	public void setRank(int rank) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getRank() {
		// TODO Auto-generated method stub
		return _officeEmployee.getRank();
	}

	@Override
	public int GetSal() {
		// TODO Auto-generated method stub
		return _officeEmployee.GetSal()+_trainerEmployee.GetSal(); 
	}
	@Override
	public void ReadConsole(Scanner scanner){
		super.ReadConsole(scanner);
		_officeEmployee.ReadOfficePart(scanner);
		_trainerEmployee.ReadTrainerPart(scanner);
		
	}

}
