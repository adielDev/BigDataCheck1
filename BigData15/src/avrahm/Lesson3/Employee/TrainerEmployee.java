package avrahm.Lesson3.Employee;
import java.util.Scanner;


 class TrainerEmployee extends Employee implements ITrainer{

	ITrainer _trainer; 
	public TrainerEmployee(){
		_trainer = new Trainer(); 
	}
	
	@Override
	public int GetSal() {
		// TODO Auto-generated method stub
		return  _trainer.GetSal();
	}
	@Override 
	public void ReadConsole(Scanner scanner){
		super.ReadConsole(scanner);
		_trainer.ReadConsole(scanner);
	}
	@Override
	public void setHours(int hours) {
		// TODO Auto-generated method stub
		_trainer.setHours(hours); 
		
	}
	@Override
	public void setHourlySal(int hourlySal) {
		// TODO Auto-generated method stub
		_trainer.setHourlySal(hourlySal);
	}
	@Override
	public int getHourlySal() {
		// TODO Auto-generated method stub
		return _trainer.getHourlySal();
	}
	@Override
	public int getHours() {
		// TODO Auto-generated method stub
		return _trainer.getHours();
	}
}
