package principleOfOOP;

public class BankEncapsulationDriver {
	public static void main(String [] args)
	{
		BankEncapsulation b1 = new BankEncapsulation("Rupesh Palke", "ICICI", "Pune","ICIC0000", 9876543210l, 1234, 500);
		b1.getuserName();
		b1.getbankName();
		b1.getaccNo();
		b1.getbalance(9876543210l, 1234);
		b1.getifsc();
		b1.getbranch();
		b1.setpin(9876543210l, 1234, 4321);
		b1.credit(9876543210l, 1234, 10000);
		b1.debit(9876543210l, 1234, 10500);
	}

}
