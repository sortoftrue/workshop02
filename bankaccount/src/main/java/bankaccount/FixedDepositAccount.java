package bankaccount;

public class FixedDepositAccount extends BankAccount {

	private Float interest;
	private Integer duration;
	private boolean interestChanged;
	private boolean durationChanged;
	
	public FixedDepositAccount(String accountName) {
		super(accountName);
		// TODO Auto-generated constructor stub
	}

	public FixedDepositAccount(String accountName, Float balance) {
		super(accountName, balance);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void setBalance(float balance) {
		System.out.println("Balance cannot be changed");
	}

	public void changeInterest(Float interest) {
		if (interestChanged) {
			System.out.println("Interest has been changed before.");
		} else {
			this.interest=interest;
			interestChanged=true;
		}	
	}
	
	public void changeDuration(Integer duration) {
		if (durationChanged) {
			System.out.println("Duration has been changed before.");
		} else {
			this.duration=duration;
			durationChanged=true;
		}	
	}
	
}
