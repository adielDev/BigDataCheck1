package avrahm.Lesson3.Employee;

public class CarDecorator extends Employee implements ICarDecorator {
	IEmpType _component;
	public CarDecorator(IEmpType component){
		_component = component;
	}
	@Override
	public int GetSal() {
		// TODO Auto-generated method stub
		return _component.GetSal() + 4000; 
	}

}
