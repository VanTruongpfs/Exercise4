package Exercise41;

public abstract class ABankAccount implements IBankAccount {
	protected String name;
	protected String id;
	protected double currentBalance;
/**
 * this is constructor of class Abstract ABankAccount. There are 3 field
 * @param name
 * @param id
 * @param currentBalance
 * example:
 * 	new CheckingAccount("Earl Gray", "#1729", 1.250, 500);
 *  new SavingAccount("Annie Proulx", "#2992", 800, 0.035);
 * 	new CD("Ima Flatt", "#4104", 10.123, 0.04, new Date(1, 6 ,2005));
 */
	public ABankAccount(String name, String id, double currentBalance) {
		this.name = name;
		this.id = id;
		this.currentBalance = currentBalance;
	}
	
	}
