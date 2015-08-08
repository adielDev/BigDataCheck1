package avrahm.Lesson3.Employee;


interface ITrainer extends IEmpType {
	void setHours(int hours);
	void setHourlySal(int hourlySal);
	int getHourlySal(); 
	int getHours(); 
}
