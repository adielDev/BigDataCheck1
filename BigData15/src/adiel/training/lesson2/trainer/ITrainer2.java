package adiel.training.lesson2.trainer;

import adiel.training.lesson2.employee.IEmpType2;

public interface ITrainer2 extends IEmpType2 {

	void setHours(int hours);
	void setHourly(int hourly);
	int getHours();
	int getHourly();
}
