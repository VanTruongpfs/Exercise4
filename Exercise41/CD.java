package Exercise41;

public class CD extends ABankAccount {
	private double interestRate;
	private Date maturityDate;
/**
 * this is constructor of class CD. There are 5 field
 * @param name
 * @param id
 * @param currentBalance
 * @param interestRate
 * @param maturityDate
 * example: 
 * 	new CD("Ima Flatt", "#4104", 10.123, 0.04, new Date(1, 6 ,2005));
 */
	public CD(String name, String id, double currentBalance, double interestRate, Date maturityDate) {
		super(name, id, currentBalance);
		this.interestRate = interestRate;
		this.maturityDate = maturityDate;
	}
	
	}
	
