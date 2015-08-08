package avrahm.Lesson3.Employee;
import java.util.Scanner;


 class Office implements IOffice {
	int _rank; 
	@Override
	public void setRank(int rank) {
		// TODO Auto-generated method stub
		_rank = rank; 	
	}

	@Override
	public int getRank() {
		// TODO Auto-generated method stub
		return _rank;
	}

	@Override
	public void ReadConsole(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("Enter employee Rank");
		_rank = scanner.nextInt();
	}

	@Override
	public int GetSal() {
		// TODO Auto-generated method stub
		return 5000+1000*_rank; 
	}

}
