
package avrahm.Lesson2;
import java.util.Scanner;


public interface IOfficeEmployee extends IEmployee {
	void setRank(int rank);
	int getRank(); 
	void ReadOfficePart(Scanner scanner); 
	
}
