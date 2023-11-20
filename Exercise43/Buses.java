package Exercise43;

public class Buses extends AAdministrators {
	private double numberOfFuelTank;
/**
 * this is a constructor of class Buses. There are 3 field
 * @param priceOfTicket -VNĐ
 * @param numberOfSeat
 * @param numberOfFuelTank
 * example:
 * 	new Buses(7.000, 16, 3);
 */
	public Buses(double priceOfTicket, int numberOfSeat, double numberOfFuelTank) {
		super(priceOfTicket, numberOfSeat);
		this.numberOfFuelTank = numberOfFuelTank;
	}
	
}
