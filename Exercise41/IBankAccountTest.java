package Exercise41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IBankAccountTest {
/**
 * this is testing for interface IBankAccount
 */
	@Test
	public void testConstructor() {
// testing for CheckingAccount
		IBankAccount c1 = new CheckingAccount("Earl Gray", "#1729", 1.250, 500);
// testing for SavingAccount
		IBankAccount s1 = new SavingAccount("Annie Proulx", "#2992", 800, 0.035);
// testing for CD
		IBankAccount cd1 = new CD("Ima Flatt", "#4104", 10.123, 0.04, new Date(1, 6 ,2005));
	}

}
