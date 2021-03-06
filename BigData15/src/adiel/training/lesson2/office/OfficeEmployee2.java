package adiel.training.lesson2.office;

import java.util.Scanner;

import adiel.training.lesson2.employee.Employee2;

public class OfficeEmployee2 extends Employee2 implements IOfficeEmployee2 {
	
	int _rank;
	IOffice2 _office2;
	
	public OfficeEmployee2(){
		_office2 = new Office2();
	}
	
	public  OfficeEmployee2(int rank) {
		_office2 = new Office2(rank);
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
	public int GetSal() {
		return _office2.GetSal();
	}

	@Override
	public void ReadConsole(Scanner scanner) {
		super.ReadConsole(scanner);
		scanner.nextLine();
		_office2.ReadConsole(scanner);
	}

	@Override
	public String toString() {
		return "OfficeEmployee2 [_rank=" + _rank + ", _office2=" + _office2
				+ "]";
	}

	

}
