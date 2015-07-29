package adiel.training.lesson1;

public class MainEmployee {

	
	public static void main(String[] args) {
	
		int numOfEmployees = 3;
		MyEmployee [] myEmployees = new MyEmployee [numOfEmployees];
		for (int i = 0; i < myEmployees.length; i++) {
			
			try {
				myEmployees[i] = MyEmployeeConsolReader.readEmployee();
			} catch (ClassNotFoundException | InstantiationException
					| IllegalAccessException e) {
				// TODO Auto-generated catch block
			//	System.out.println("exception");
				e.printStackTrace();
			}
		}
		
		for (int i = 0; i < myEmployees.length; i++) {
			System.out.println(myEmployees[i]);
		}
		
		
	}

}
