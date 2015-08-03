package adiel.training.lesson2.office;

import java.util.Scanner;

public class Office2 implements IOffice2 {

	private int _rank;

	public Office2(){
		
	}
	
	public Office2(int rank) {
		_rank = rank;
	}

	@Override
	public void setRank(int rank) {
		_rank = rank;
	}

	@Override
	public int getRank() {
		return _rank;
	}

	@Override
	public String toString() {
		return "Office2 [_rank=" + _rank + "]";
	}
	
	

}
