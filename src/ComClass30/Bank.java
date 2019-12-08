package ComClass30;

public interface Bank {
	
	void haveChecking();
	void haveSavings();

}

interface Trustable{
	void trust();
}
class Finance{
	public void financing() {
		System.out.println("Financial transuktion");
	}
}

class BOA implements Bank{
	
	@Override
	public void haveChecking() {
		System.out.println("BOA has a checking account");
	}
	public void haveSavings() {
		System.out.println("BOA has a saving account");
	
}
}
class CapitalOne implements Bank{
	@Override
	public void haveChecking() {
		System.out.println("CapitalOne has a checking account");
	}
	public void haveSavings() {
		System.out.println("CapitalOne has a saving account");
	
}
	
}
class BOA implements Bank,Trustable{
	
}