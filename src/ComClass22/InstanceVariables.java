package ComClass22;

public class InstanceVariables {
	String name="Samir";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Burcu";
		System.out.println(name);
InstanceVariables obj=new InstanceVariables();
System.out.println(obj.name);
obj.name="john";
System.out.println(obj.name);


InstanceVariables obj1=new InstanceVariables();
System.out.println(obj1.name);
	}

}
