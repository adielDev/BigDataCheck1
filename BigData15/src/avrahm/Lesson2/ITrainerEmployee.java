
package avrahm.Lesson2;
import java.util.Scanner;


public interface ITrainerEmployee extends IEmployee {
	void setHours(int hours);
	void setHourlySal(int hourlySal);
	int getHourlySal(); 
	int getHours(); 
	void ReadTrainerPart(Scanner scanner); 
}
