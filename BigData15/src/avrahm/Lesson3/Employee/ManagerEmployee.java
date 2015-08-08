package avrahm.Lesson3.Employee;
import java.util.Scanner;


 class ManagerEmployee extends Employee implements IManager{
	IManager _manager; 
	public ManagerEmployee(){
		_manager = new Manager(); 
	}
	@Override
	public void setHours(int hours) {
		// TODO Auto-generated method stub
		_manager.setHours(hours);
	}

	@Override
	public void setHourlySal(int hourlySal) {
		// TODO Auto-generated method stub
		_manager.setHourlySal(hourlySal);
	}

	@Override
	public int getHourlySal() {
		// TODO Auto-generated method stub
		return _manager.getHourlySal();
	}

	@Override
	public int getHours() {
		// TODO Auto-generated method stub
		return _manager.getHours();
	}

	@Override
	public void setRank(int rank) {
		// TODO Auto-generated method stub
		_manager.setRank(rank);
	}

	@Override
	public int getRank() {
		// TODO Auto-generated method stub
		return _manager.getRank();
	}

	@Override
	public int GetSal() {
		// TODO Auto-generated method stub
		return _manager.GetSal();  
	}
	@Override
	public void ReadConsole(Scanner scanner){
		super.ReadConsole(scanner);
		_manager.ReadConsole(scanner);
		
	}
		

}
