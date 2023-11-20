package Exercise41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ABankAccountTest {
/**
 * this is testing for CheckingAccount of class ABankAccount
 */
	@Test
	public void testCheckingAccount() {
		new CheckingAccount("Earl Gray", "#1729", 1.250, 500);
	}
/**
 * this is testing for SavingAccount of class ABank
 */
	@Test
	public void testSavingAccount() {
		new SavingAccount("Annie Proulx", "#2992", 800, 0.035);
	}
/**
 * this is testing for CD of class ABank
 */
	@Test
	public void testCD() {
		new CD("Ima Flatt", "#4104", 10.123, 0.04, new Date(1, 6 ,2005));
	}

}
