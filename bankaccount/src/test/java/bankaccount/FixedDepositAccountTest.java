package bankaccount;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FixedDepositAccountTest {

	FixedDepositAccount account;
	
	@Before
	public void setUp() throws Exception {
		account = new FixedDepositAccount("James",100f);
	}

	@Test
	public void testSetBalance() {
		account.setBalance(120f);
		assertEquals(3,account.getBalance(),0.01);
	}
	
	@Test
	public void testChangeInterest() {
		account.changeInterest(5f);
		assertEquals(5,account.getInterest(),0.01);
	}

	@Test (expected = IllegalArgumentException.class)
	public void testChangeInterest_secondTime() {
		account.changeInterest(5f);
		account.changeInterest(4f);
	}
	
	@Test
	public void testChangeDuration() {
		account.changeDuration(5);
		assertEquals(5,account.getDuration(),0.01);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testChangeDuratoin_secondTime() {
		account.changeDuration(5);
		account.changeDuration(4);
	}

}
