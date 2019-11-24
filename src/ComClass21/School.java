package ComClass21;

import ComClass20.Myself;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myself m = new Myself();
		Student student1 = new Student();
		student1.studentName ="Eric";
		student1.GPA = 3.95;
		student1.school="Syantax";
		
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
