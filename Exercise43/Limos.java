package Exercise43;

public class Limos extends AAdministrators {
	private double numberOfFuelTank;
	private String comment;
/**
 * this is a constructor of class Limos. There are 4 field
 * @param priceOfTicket -VNĐ
 * @param numberOfSeat
 * @param numberOfFuelTank
 * @param comment
 * example:
 *  new Limos(190.000, 9, 5, "comfortable");
 */
	public Limos(double priceOfTicket, int numberOfSeat, double numberOfFuelTank, String comment) {
		super(priceOfTicket, numberOfSeat);
		this.numberOfFuelTank = numberOfFuelTank;
		this.comment = comment;
	}
	
}
