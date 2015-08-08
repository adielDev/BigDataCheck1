package avrahm.Lesson3;

import avrahm.Lesson3.Employee.Interfaces.IEmployee;

public class CompareEmployeeByName implements ICompareEmployee {

	@Override
	public int compare(IEmployee e1, IEmployee e2) {
		// TODO Auto-generated method stub
		return e1.getName().compareTo(e2.getName());
	}

}
