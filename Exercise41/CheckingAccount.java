package Exercise41;

public class CheckingAccount extends ABankAccount {
	private double minimumBalance;
/**
 * this is constructor of class CheckingAccount. There are 4 field
 * @param name
 * @param id
 * @param currentBalance
 * @param minimumBalance
 * example
 * 	new CheckingAccount("Earl Gray", "#1729", 1.250, 500);
 */
	public CheckingAccount(String name, String id, double currentBalance, double minimumBalance) {
		super(name, id, minimumBalance);
		this.minimumBalance = minimumBalance;
	}

}