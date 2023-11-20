package Exercise41;

public class SavingAccount extends ABankAccount {
	private double interestRate;
/**
 * this is constructor of class SavingBank. There are 4 field
 * @param name
 * @param id
 * @param currentBalance
 * @param interestRate
 * example:
 *  new SavingAccount("Annie Proulx", "#2992", 800, 0.035);
 */
	public SavingAccount(String name, String id, double currentBalance, double interestRate) {
		super(name, id, currentBalance);
		this.interestRate = interestRate;
	}
	
	}


