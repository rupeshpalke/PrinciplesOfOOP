package principleOfOOP;

public class BankEncapsulation {
	private String userName;
	private String bankName;
	private String branch;
	private String ifsc;
	private long accNo;
	private int pin;
	private double balance;
	
	BankEncapsulation(String userName, String bankName, String branch,String ifsc, long accNo, int pin, double balance)
	{
		this.userName = userName;
		this.bankName = bankName;
		this.branch = branch;
		this.ifsc = ifsc;
		this.accNo = accNo;
		this.pin = pin;
		this.balance = balance;
	}
	public void getuserName() 
	{
		System.out.println("Your username is "+userName);
	}
	public void getbankName() 
	{
		System.out.println("Your bank is "+bankName);
	}
	public void getbranch() 
	{
		System.out.println("Your branch is "+branch);
	}
	public void getifsc() 
	{
		System.out.println("Your ifsc is "+ifsc);
	}
	public void getaccNo() 
	{
		System.out.println("Your account no is "+accNo);
	}
	public void setpin(long accNo, int pin, int newPin) 
	{
		if(this.accNo==accNo && this.pin==pin) {
			this.pin = newPin;
			System.out.println("Pin updated.");
		}
		else {
			System.out.println("Invalid Credentials.");
		}
	}
	public void getbalance(long accNo, int pin)
	{
		if(this.accNo==accNo && this.pin==pin) {
			System.out.println("Your balance is"+balance);
		}
		else {
			System.out.println("Invalid Credentials.");
		}
	}
	public void credit(long accNo, int pin, double amount)
	{
		if(this.accNo==accNo && this.pin==pin) 
		{
			if(amount>0)
			{
				this.balance += amount;
				System.out.println("Your balance is"+balance);
			}
			else
			{
				System.out.println("Invalid Amount. Enter a valid amount.");
			}
		}	
		else 
		{
			System.out.println("Invalid Credentials.");
		}
	}
	public void debit(long accNo, int pin, double amount)
	{
		if(this.accNo==accNo && this.pin==pin) 
		{
			if(amount>0 && this.balance-amount>500)
			{
				this.balance -= amount;
				System.out.println("Your balance is"+balance);
			}
			else
			{
				System.out.println("Insufficient Balance");
			}
		}	
		else 
		{
			System.out.println("Invalid Credentials.");
		}
	}
}
