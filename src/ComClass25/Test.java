package ComClass25;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Create an object of an Employee class");
		Employee emp=new Employee();
		emp.salary=70000;
		Employee.companyName="Syantax";
		emp.work();
		emp.getPaid();
		
		System.out.println("Creating an object");
		ScrumTeam sm=new ScrumTeam();
		sm.salary=90000;
		sm.work();
		sm.getPaid();
		sm.artifacts="Product Backlog,Sprint Backlog, Burnt down chart";
		sm.ceremonies="Sprint Demo,Plannin,Retro,Daily Standup";
		sm.attendScrumMeetings();
		Developer dev=new Developer();
		dev.salary=130000;
		dev.work();
		dev.getPaid();
		dev.code();
		dev.artifacts="Sprint Backlog";
		dev.ceremonies="Sprint Demo, Planning, Retro, Daily StandUp";
		dev.attendScrumMeetings();
		

		

	}

}
