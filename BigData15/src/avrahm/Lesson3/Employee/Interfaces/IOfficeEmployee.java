package avrahm.Lesson3.Employee.Interfaces;

import java.util.Scanner;


public interface IOfficeEmployee extends IEmployee {
	void setRank(int rank);
	int getRank(); 
	void ReadOfficePart(Scanner scanner); 
	
}
