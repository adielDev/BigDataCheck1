package avrahm.Lesson2;
import java.util.Scanner;


public class OfficeEmployee extends Employee implements IOfficeEmployee{
	private int _rank;
	public OfficeEmployee(){
		
	}
	@Override
	public int GetSal(){
		return 5000+1000*_rank; 
	}
	 
	public OfficeEmployee(int rank){
		setRank(rank);
	}
	@Override
	public void setRank(int rank){
		_rank = rank; 
	}
	@Override 
	public void ReadConsole(Scanner scanner){
		super.ReadConsole(scanner);
		System.out.println("Enter employee rank ");
		_rank = scanner.nextInt();
	}
	@Override
	public int getRank() {
		// TODO Auto-generated method stub
		return _rank;
	}
	
}
