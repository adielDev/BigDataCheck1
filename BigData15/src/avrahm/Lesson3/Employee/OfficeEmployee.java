package avrahm.Lesson3.Employee;
import java.util.Scanner;


class OfficeEmployee extends Employee implements IOffice{
	IOffice _office; 
	public OfficeEmployee(){
		_office = new Office();
	}
	@Override
	public int GetSal(){
		return _office.GetSal(); 
	}
	 
	
	@Override
	public void setRank(int rank){
		_office.setRank(rank);
	}
	@Override 
	public void ReadConsole(Scanner scanner){
		super.ReadConsole(scanner);
		_office.ReadConsole(scanner);
	}
	@Override
	public int getRank() {
		// TODO Auto-generated method stub
		return _office.getRank();
	}
	
	
}
