package ComClass21;

public class TaskStudent {
	
	
	public String studentName;
	public int studentId;
	public static int numberOfStudent;

	public static void main(String[] args) {
		
		TaskStudent s1=new TaskStudent();
		
		s1.studentName="Ali";
		s1.studentId=345;
		s1.numberOfStudent++;
	
		
	TaskStudent s3=new TaskStudent();
		
		s3.studentName="Seval";
		s3.studentId=456;
		s3.numberOfStudent++;
		TaskStudent s5=new TaskStudent();
		
		
		s5.studentName="Samuel";
		s5.studentId=567;
		s5.numberOfStudent++;
		
		System.out.println("The total number of student is:");

	}

}
