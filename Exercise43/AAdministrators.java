package Exercise43;

public abstract class AAdministrators implements IAdministrators {
	protected double priceOfTicket;
	protected int numberOfSeat;
/**
 * this is a constructor of class AAdministrators. There are 2 field
 * @param priceOfTicket
 * @param numberOfSeat
 *example:
 *	AAdministrators b1 = new Buses(7.000, 16, 3);
 *	AAdministrators l1 = new Limos(190.000, 9, 5, "comfortable");
 *  AAdministrators s1 = new Subways(5.000, 147, "Metro Line 1", "electric", 3);
 *  AAdministrators s2 = new Subways(10.000, 294, "Metro Line 2", "electric", 6);
 */
	public AAdministrators(double priceOfTicket, int numberOfSeat) {
		this.priceOfTicket = priceOfTicket;
		this.numberOfSeat = numberOfSeat;
	}
	
	

}
