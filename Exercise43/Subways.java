package Exercise43;

public class Subways extends AAdministrators{
	private String kind;
	private String fuel;
	private double numberOfTrainCar;
/**
 * this is a constructor of class Subways. There are 5 field
 * @param priceOfTicket -VNĐ
 * @param numberOfSeat
 * @param kind
 * @param fuel
 * @param numberOfTrainCar
 * example:
 *  new Subways(5.000, 147, "Metro Line 1", "electric", 3);
 *  new Subways(10.000, 294, "Metro Line 2", "electric", 6);
 */
	public Subways(double priceOfTicket, int numberOfSeat, String kind, String fuel, double numberOfTrainCar) {
		super(priceOfTicket, numberOfSeat);
		this.kind = kind;
		this.fuel = fuel;
		this.numberOfTrainCar = numberOfTrainCar;
	}
	
	
}
