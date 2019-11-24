package ComClass21;

public class Employee4 {
	
	int eID=5;
	int salary=200;
	static String CEO="Sumair";
	void printInfo() {
		System.out.println("Employee Id:" +eID+ ", salary is:"+salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee4 emp1=new Employee4();
		emp1.printInfo();
		
		
		Employee4 emp2=new Employee4();
		emp2.printInfo();
		
		emp2.eID=3;
		emp2.salary=300;
		emp2.printInfo();
		emp1.printInfo();
		
		

	}
	

}
