package Exercise47;

public class Limo extends ATaxiVehicle {
	private int minRental;
/**
 * this is a constructor of class Limo
 * @param idNumber
 * @param passengers
 * @param pricePerMile
 * @param minRental
 * example:
 *  new Limo(01, 9, 10, 20);
 *  new Limo(02, 11, 12, 21);
 *  new Limo(03, 11, 13, 21);
 */
	public Limo(int idNumber, int passengers, int pricePerMile, int minRental) {
		super(idNumber, passengers, pricePerMile);
		this.minRental = minRental;
	}
/**
 * this is a method fare() of class Limo
 * @return
 * example:
 *  new Limo(01, 9, 10, 20);
 *  new Limo(02, 11, 12, 21);
 *  new Limo(03, 11, 13, 21);
 *   Limo l1 = new Limo(01, 9, 10, 20);
 *   Limo l2 = new Limo(02, 11, 12, 21);
 *   Limo l3 = new Limo(03, 11, 13, 21);
 *   	assertEquals(l1.fare(3), 30);
*		assertEquals(l2.fare(3), 36);
*	 	assertEquals(l3.fare(3), 39);
 */
@Override
	public double fare(int mile) {
	if(this.pricePerMile*mile > this.minRental) {
		return this.pricePerMile*mile;
	}else {
		return this.minRental;
		}
	}
}