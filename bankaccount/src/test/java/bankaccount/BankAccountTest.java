package bankaccount;

import static org.junit.Assert.*;

import org.junit.*;

public class BankAccountTest {
	
	private BankAccount account;
	
	@Before
	public void setup() {
		System.out.println("Running");
		account = new BankAccount("james");
	}
	
	@Test
	public void testDeposit() throws Exception {
		account.deposit(100.00f);
		assertEquals(100.00,account.getBalance(),0.001);
	
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDeposit_isClosed() throws Exception{
		account.setClosed(true);
		account.deposit(100f);
	}
	
	@Test
	public void testWithdraw() throws Exception {
		account.withdraw(100.00f);
		assertEquals(-100.00,account.getBalance(),0.001);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testWithdraw_isClosed() throws Exception{
		account.setClosed(true);
		account.withdraw(100f);
	}
}
