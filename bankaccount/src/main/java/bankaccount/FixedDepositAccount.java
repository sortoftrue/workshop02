package bankaccount;

public class FixedDepositAccount extends BankAccount {

	private Float interest;
	private Integer duration;
	private boolean interestChanged;
	private boolean durationChanged;
	
	public FixedDepositAccount(String accountName, Float balance) {
		this(accountName, balance, 3f);
		
	}
	
	public FixedDepositAccount(String accountName, Float balance, Float interest) {
		this(accountName, balance, interest,6);
	}
	
	public FixedDepositAccount(String accountName, Float balance, Float interest, Integer duration) {
		super(accountName, balance);
		this.interest=interest;
		this.duration=duration;
	}
	
	
	
	
	public Float getInterest() {
		return interest;
	}

	public Integer getDuration() {
		return duration;
	}

	@Override
	public void setBalance(float balance){
		System.out.println("Balance cannot be changed");
	}

	public void changeInterest(Float interest) {
		if (interestChanged) {
			System.out.println("Interest has been changed before.");
			throw new IllegalArgumentException();
		} else {
			this.interest=interest;
			interestChanged=true;
		}	
	}
	
	public void changeDuration(Integer duration) {
		if (durationChanged) {
			System.out.println("Duration has been changed before.");
			throw new IllegalArgumentException();
		} else {
			this.duration=duration;
			durationChanged=true;
		}	
	}

	@Override
	public void deposit(Float amount) {
		//NIL
	}

	@Override
	public void withdraw(Float amount) {
		//NIL
	}

	@Override
	public float getBalance() {
		
		return super.getBalance() * interest / 100;
	}
	
	
	
	
}
