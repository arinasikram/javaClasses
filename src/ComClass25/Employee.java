package ComClass25;

public class Employee {

	int salary;
	protected int employeeId;
	private String employeeSsn;
	protected static String companyName;
	
	void work() {
		
		System.out.println("I work in "+companyName+" company");
	}
	
protected	void getPaid() {
		System.out.println("I get paid "+salary);
		
	}
}
