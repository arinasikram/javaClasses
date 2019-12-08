package ComClass27;

public class TaskStudent {
	
	
	public static void study() {// overrriding method
		System.out.println("Student study");

}
	
	public static void typing() {
		System.out.println("Student typing");
	}

class SyantaxStudent extends TaskStudent {
	
	public void studyHours() {// overrriding method
		System.out.println("Study hours for SyantaxStuden studying is 6hrs a day");
}
	
	class CollegeStudent extends TaskStudent{
		public void studyHours() {
			System.out.println(" Study hours for collegeStudent studying is 8 hours a day");
		}
		class SchoolStudent extends TaskStudent{
			public void studyHours() {
				System.out.println(" Study hours for schoolStudent studying is 4 hours a day");
			}
			
		}		
		
	
	}
}

}


	// TODO Auto-generated method stub
	




