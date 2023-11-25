package Exercise47;

public class Cab extends ATaxiVehicle {
/**
 * this is a constructor of class Cab. There are 3 field
 * @param idNumber
 * @param passengers
 * @param pricePerMile
 * example:
 * 	new Cab(01, 4, 2);
 * 	new Cab(02, 4, 5);
 * 	new Cab(03, 4, 3);
 */
	public Cab(int idNumber, int passengers, int pricePerMile) {
		super(idNumber, passengers, pricePerMile);
	}
/**
 * this is a method fare of class Cab
 * @return
 * example:
 * 	new Cab(01, 4, 2);
 * 	new Cab(02, 4, 5);
 * 	new Cab(03, 4, 3);
 * 	 Cab c1 = new Cab(01, 4, 2);
 * 	 Cab c2 = new Cab(02, 4, 5);
 * 	 Cab c3 = new Cab(03, 4, 3);
 * 		assertEquals(c1.fare(1), 2);
 * 		assertEquals(c2.fare(1), 5);
 * 		assertEquals(c3.fare(1), 3);
 */
@Override
public double fare(int mile) {
	return this.pricePerMile * mile;
}
}
