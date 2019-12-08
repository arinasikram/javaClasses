package ComClass26;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank bank=new Bank();
		bank.money=900;
	double fee=	bank.chargeFee();
	
	PNC pnc=new PNC();
	System.out.println("Bank fee= "+fee);
	double pncFee=pnc.chargeFee();
	System.out.println("PNC fee= "+pncFee);

	}

}
