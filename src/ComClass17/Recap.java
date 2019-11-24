package ComClass17;

public class Recap {
 int students,teachers,classRoom;
 String name,address,website;
 
 void study() {
	 
	 System.out.println(("student studying at "+name));
 }
 void teach() {
	 System.out.println("Teacher teaching at "+name);
 }
 public static void main(String[]args) {
	 
	 Recap school=new Recap();
	 school.name="Syntax";
	 school.students=200;
	 
	 Recap school1=new Recap();
	 school.name="Pinnacle";
	 school.students=200;
	 school.teach();
	 school.study();
 }
}
