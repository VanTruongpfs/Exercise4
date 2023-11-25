package Exercise47;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public abstract class ATaxiVehicle implements ITaxiVehicle {
	protected int idNumber;
	protected int passengers;
	protected int pricePerMile;
/**
 * this is a constructor of class ATaxiVehicle. There are 3 field
 * @param idNumber
 * @param passengers
 * @param pricePerMile
 * example:
* // this is a constructor of class Cab
*	ATaxiVehicle c1 = new Cab(01, 4, 2);
*	ATaxiVehicle c2 = new Cab(02, 4, 5);
*	ATaxiVehicle c3 = new Cab(03, 4, 3);
* // this is a constructor of class Limo
*	ATaxiVehicle l1 = new Limo(01, 9, 10, 20);
*	ATaxiVehicle l2 = new Limo(02, 11, 12, 21);
*	ATaxiVehicle l3 = new Limo(03, 11, 13, 21);
* // this is a constructor of class Van
*	ATaxiVehicle v1 = new Van(01, 4, 20, true);
*	ATaxiVehicle v2 = new Van(02, 7, 30, true);
*	ATaxiVehicle v3 = new Van(03, 45, 70, false);
 */
	public ATaxiVehicle(int idNumber, int passengers, int pricePerMile) {
		this.idNumber = idNumber;
		this.passengers = passengers;
		this.pricePerMile = pricePerMile;
	}
/**
 * this is a method fare()
 * example:
* // this is tesing method fare() for Cab
*		ATaxiVehicle c1 = new Cab(01, 4, 2);
*		ATaxiVehicle c2 = new Cab(02, 4, 5);
*		ATaxiVehicle c3 = new Cab(03, 4, 3);
*			assertEquals(c1.fare(1), 2);
*			assertEquals(c2.fare(1), 5);
*		 	assertEquals(c3.fare(1), 3);
* // this is tesing method fare() for Limo
*		ATaxiVehicle l1 = new Limo(01, 9, 10, 20);
*	 	ATaxiVehicle l2 = new Limo(02, 11, 12, 21);
*		ATaxiVehicle l3 = new Limo(03, 11, 13, 21);
*		 	assertEquals(l1.fare(3), 30);
*			assertEquals(l2.fare(3), 36);
*		 	assertEquals(l3.fare(3), 39);
* // this is tesing method fare() for Van
*		ATaxiVehicle v1 = new Van(01, 4, 20, true);
*		ATaxiVehicle v2 = new Van(02, 7, 30, true);
*		ATaxiVehicle v3 = new Van(03, 45, 70, false);
*			assertEquals(v1.fare(1), 24);
*			assertEquals(v2.fare(1),37);
*			assertEquals(v3.fare(1),115);
*	
 */
	public abstract double fare(int mile);
/**
 * this is a method lowerThan()
 * @param mile 
 * @param amount	 
 * @return
* example:
* // this is tesing method lowerThan() for Cab
*		ATaxiVehicle c1 = new Cab(01, 4, 2);
*		ATaxiVehicle c2 = new Cab(02, 4, 5);
*		ATaxiVehicle c3 = new Cab(03, 4, 3);
*			assertTrue(c1.lowerThan(1, 6));
*			assertTrue(c2.lowerThan(1, 6));
*			assertTrue(c3.lowerThan(1, 6));
* // this is tesing method lowerThan() for Limo
*		ATaxiVehicle l1 = new Limo(01, 9, 10, 20);
*		ATaxiVehicle l2 = new Limo(02, 11, 12, 21);
*		ATaxiVehicle l3 = new Limo(03, 11, 13, 21);
*		 	assertTrue(l1.lowerThan(3, 34));
*		 	assertFalse(l2.lowerThan(3, 34));
*			assertFalse(l3.lowerThan(3, 34));
* // this is tesing method lowerThan() for Van
*		ATaxiVehicle v1 = new Van(01, 4, 20, true);
*		ATaxiVehicle v2 = new Van(02, 7, 30, true);
*		ATaxiVehicle v3 = new Van(03, 45, 70, false);
*			assertTrue(v1.lowerThan(1, 50));
			assertTrue(v2.lowerThan(1, 50));
			assertFalse(v3.lowerThan(1, 50));
 */
	public boolean lowerThan(int mile, int amount) {
		if(this.fare(mile) < amount) {
			return true;
		}else {
			return false;
		}
	}
/**
 * this is a method cheaperThan()
 * @param other
 * @param mile
 * @return
 * example:
* // this is tesing method cheaperThan() for Cab
*		ATaxiVehicle c1 = new Cab(01, 4, 2);
*		ATaxiVehicle c2 = new Cab(02, 4, 5);
*		ATaxiVehicle c3 = new Cab(03, 4, 3);
*			assertTrue(c1.cheaperThan(c2, 1));
*			assertFalse(c2.cheaperThan(c3, 1));
*			assertFalse(c3.cheaperThan(c1, 1));
* // this is tesing method cheaperThan() for Limo
*		ATaxiVehicle l1 = new Limo(01, 9, 10, 20);
*		ATaxiVehicle l2 = new Limo(02, 11, 12, 21);
*		ATaxiVehicle l3 = new Limo(03, 11, 13, 21);
*		 	assertTrue(l1.cheaperThan(l2, 3));
*			assertTrue(l2.cheaperThan(l3, 3));
*			assertFalse(l3.cheaperThan(l1, 3));
* // this is tesing method cheaperThan() for Van
*		ATaxiVehicle v1 = new Van(01, 4, 20, true);
*		ATaxiVehicle v2 = new Van(02, 7, 30, true);
*		ATaxiVehicle v3 = new Van(03, 45, 70, false);
*			assertTrue(v1.cheaperThan(v2, 1));
*			assertTrue(v2.cheaperThan(v3, 1));
*			assertFalse(v3.cheaperThan(v1, 1));
 */
	public boolean cheaperThan(ATaxiVehicle other, int mile) {
		if(this.fare(mile)< other.fare(mile)) {
			return true;
		}else {
			return false;
		}
	}
}
