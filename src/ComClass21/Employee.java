package ComClass21;

import ComClass20.Myself;

public class Employee {

	private String eID;
	private double salary;
	private String CEO;

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
		
			Employee employee1 = new Employee();
			employee1.eID ="Eric";
			employee1.salary = 60000;
			employee1.CEO="Sumair";
			
			Student student2= new Student();
			
			student2.studentName ="Jaime";
			student2.GPA = 3.90;
			student2.school="Syantax";
			
			student1.displayInfo();
			student2.displayInfo();
			
			
			int hours=3;
			hours=4;
			student1.study(hours);
			
		}

	}

		// TODO Auto-generated method stub

	}

}
