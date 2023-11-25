package Exercise47;

public class Van extends ATaxiVehicle{
	private boolean access;
/**
 * this is a constructor of class ATaxiVehicle
 * @param idNumber
 * @param passengers
 * @param pricePerMile
 * @param access
 *example:
 *	new Van(01, 4, 20, true);
 *	new Van(02, 7, 30, true);
 *	new Van(03, 45, 70, false);
 */
	public Van(int idNumber, int passengers, int pricePerMile, boolean access) {
		super(idNumber, passengers, pricePerMile);
		this.access = access;
	}
/**
 * this is a method fare of class Van
 * @return
 * example:
 * 	new Van(01, 4, 20, true);
 *	new Van(02, 7, 30, true);
 *	new Van(03, 45, 70, false);
 *	Van v1 = new Van(01, 4, 20, true);
 *	Van v2 = new Van(02, 7, 30, true);
 *	Van v3 = new Van(03, 45, 70, false);
 *		assertEquals(v1.fare(1), 24);
 *		assertEquals(v2.fare(1),37);
 *		assertEquals(v3.fare(1),115);
 */
	public double fare(int mile) {
		return this.pricePerMile*mile + this.passengers;
	}
}
