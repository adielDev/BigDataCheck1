package adiel.training.lesson1;

import java.util.Scanner;

public class OfficeEmployee extends MyEmployee{
	
	int _rank;
	
	



	public int get_rank() {
		return _rank;
	}


	public void set_rank(int _rank) {
		this._rank = _rank;
	}


	

	@Override
	public void readEmployeeDetailsFromConsol(Scanner scaanner) {
		// TODO Auto-generated method stub
		super.readEmployeeDetailsFromConsol(scaanner);
		scaanner.nextLine();
		System.out.println("enter employee rank");
		_rank = scaanner.nextInt();	//TODO why not throw exception ?

	}


	@Override
	public int getSal() {
		// TODO Auto-generated method stub
		return 100*_rank;
	}


	@Override
	public String toString() {
		return "OfficeEmployee [_rank=" + _rank + "]";
	}
	
	

}
