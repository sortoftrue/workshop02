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
	public void testBankAccountString() {
		fail("Not yet implemented");
	}
	
	
	@Test
	public void testBankAccountStringFloat() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBalance() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetBalance() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTransactions() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetTransactions() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsClosed() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetClosed() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCloseDate() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCloseDate() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetOpenDate() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetOpenDate() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAccountName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAccountNumber() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeposit() throws Exception {
		account.deposit(100.00f);
		assertEquals(100.00,account.getBalance(),0.001);
		
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
