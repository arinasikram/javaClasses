package ComClass21;

public class Stud {
	
	String student;
	String ID ;
	static String numberOfStudent;
	void printInfo() {
		System.out.println("student:" +ID+ ", numberOfStudent:");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stud student1=new Stud();
		student1.printInfo();
		
		
		Employee4 emp2=new Employee4();
		emp2.printInfo();
		
		emp2.eID=3;
		emp2.salary=300;
		emp2.printInfo();
		emp1.printInfo();
		
		

	}
	

}
