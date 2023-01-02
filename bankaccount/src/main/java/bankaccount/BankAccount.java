package bankaccount;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

public class BankAccount {

	private String accountName;
	private String accountNumber;
	private Float balance;
	private List<String> transactions = new LinkedList<>();
	private boolean isClosed;
	private int closeDate;
	private int openDate;
	
	public BankAccount(String accountName) {
		this(accountName, 0f);
	}
	
	public BankAccount(String accountName, Float balance) {
		this.accountName=accountName;
		this.balance=balance;
	}
	
	
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public List<String> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<String> transactions) {
		this.transactions = transactions;
	}
	public boolean isClosed() {
		return isClosed;
	}
	public void setClosed(boolean isClosed) {
		this.isClosed = isClosed;
	}
	public int getCloseDate() {
		return closeDate;
	}
	public void setCloseDate(int closeDate) {
		this.closeDate = closeDate;
	}
	public int getOpenDate() {
		return openDate;
	}
	public void setOpenDate(int openDate) {
		this.openDate = openDate;
	}
	public String getAccountName() {
		return accountName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void deposit(Float amount) {
		
		if(amount<=0 || isClosed) {
			throw new IllegalArgumentException();
		} else {
			balance+=amount;
			
			LocalDateTime myDateObj = LocalDateTime.now();
		    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("<dd-MM-yyyy HH:mm:ss>");
		    String formattedDate = myDateObj.format(myFormatObj);
			
			transactions.add("deposit $"+amount+" at " +formattedDate);
		}	
	}
	
	public void withdraw(Float amount) {
		
		if(amount<=0 || isClosed) {
			throw new IllegalArgumentException();
		} else {
			balance-=amount;
			
			LocalDateTime myDateObj = LocalDateTime.now();
		    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("<dd-MM-yyyy HH:mm:ss>");
		    String formattedDate = myDateObj.format(myFormatObj);
			
			transactions.add("withdraw $"+amount+" at " +formattedDate);
		}	
	}
	
	
	
	
}
