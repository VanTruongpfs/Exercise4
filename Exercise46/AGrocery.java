package Exercise46;

public abstract class AGrocery implements IGrocery {
	protected String brandName;
	protected double weight;
	protected double price;
/**
 * this is a constructor of class AGrocery. There are 3 field
 * @param brandName
 * @param weight
 * @param price
 * example:
 * //this is a constructor of class Coffee
*		new Coffee("Hawaiian Kona", 100, 15.95, "decaffeinated");
*		new Coffee("Ethiopian", 1000, 8.0, "regular");
*		new Coffee("Colombian Supreme ", 1700, 9.5, "regular");
* //this is a constructor of class Juice
*		new Juice("Orange Juice", 250, 10, "Orange", "bottled");
*		new Juice("Banana Juice", 200, 9, "Banana", "fresh");
*		new Juice("Apple Juice", 150, 7, "Apple", "bottled");
* //this is a constructor of class IceCream
*		new IceCream("CoconutCream", 100, 15, "Coconut", "sorbet");
*		new IceCream("MilkCream", 150, 13, "Milk", "frozen yogurt");
*		new IceCream("CocoaCream", 80, 12, "Cocoa", "sorbet");
 * 	
 */
	public AGrocery(String brandName, double weight, double price) {
		this.brandName = brandName;
		this.weight = weight;
		this.price = price;
	}
/**
 * this is a method unitPrice()
 * @return
 * example:
 * 	AGrocery c1 = new Coffee("Hawaiian Kona", 100, 15.95, "decaffeinated");
*	AGrocery c2 = new Coffee("Ethiopian", 1000, 8.0, "regular");
*	AGrocery c3 = new Coffee("Colombian Supreme ", 1700, 9.5, "regular");
*		assertEquals(c1.unitPrice(),6,27,0.001);
*		assertEquals(c2.unitPrice(),125);
*		assertEquals(c3.unitPrice(),178,94,0.01);
*	AGrocery j1 = new Juice("Orange Juice", 250, 10, "Orange", "bottled");
*	AGrocery j2 = new Juice("Banana Juice", 200, 9, "Banana", "fresh");
*	AGrocery j3 = new Juice("Apple Juice", 150, 7, "Apple", "bottled");
*		assertEquals(j1.unitPrice(),25);
*		assertEquals(j2.unitPrice(),22.2, 0.1);
*		assertEquals(j3.unitPrice(),21,4, 0.1);
*	AGrocery b1 = new IceCream("CoconutCream", 100, 15, "Coconut", "sorbet");
*	AGrocery b2 = new IceCream("MilkCream", 150, 13, "Milk", "frozen yogurt");
*	AGrocery b3 = new IceCream("CocoaCream", 80, 12, "Cocoa", "sorbet");
*		assertEquals(b1.unitPrice(),6.67, 0,01);
*		assertEquals(b2.unitPrice(),11.5, 0,1);
*		assertEquals(b3.unitPrice(),6.67, 0,01);
 */

	public double unitPrice() {
		return this.weight/this.price;
	}
/**
 * this is a method lowerPrice()
 * @param givenAmount
 * @return
 * example:
 * 	AGrocery c1 = new Coffee("Hawaiian Kona", 100, 15.95, "decaffeinated");
*	AGrocery c2 = new Coffee("Ethiopian", 1000, 8.0, "regular");
*	AGrocery c3 = new Coffee("Colombian Supreme ", 1700, 9.5, "regular");
*		assertTrue(c1.lowerPrice(30));
*		assertFalse(c2.lowerPrice(30));
*		assertFalse(c3.lowerPrice(30));
*	AGrocery j1 = new Juice("Orange Juice", 250, 10, "Orange", "bottled");
*	AGrocery j2 = new Juice("Banana Juice", 200, 9, "Banana", "fresh");
*	AGrocery j3 = new Juice("Apple Juice", 150, 7, "Apple", "bottled");
 * 		assertTrue(j1.lowerPrice(30));
*		assertTrue(j2.lowerPrice(30));
*		assertTrue(j3.lowerPrice(30));
*	AGrocery b1 = new IceCream("CoconutCream", 100, 15, "Coconut", "sorbet");
*	AGrocery b2 = new IceCream("MilkCream", 150, 13, "Milk", "frozen yogurt");
*	AGrocery b3 = new IceCream("CocoaCream", 80, 12, "Cocoa", "sorbet");
*		assertTrue(b1.lowerPrice(30));
*		assertTrue(b2.lowerPrice(30));
*		assertTrue(b3.lowerPrice(30));
 */
	public boolean lowerPrice(double givenAmount) {
		if(this.unitPrice() < givenAmount) {
			return true;
		}else {
			return false;
		}
	}
/**
 * this is a method cheaperThan()
 * @return
 * example:
 * 	AGrocery c1 = new Coffee("Hawaiian Kona", 100, 15.95, "decaffeinated");
*	AGrocery c2 = new Coffee("Ethiopian", 1000, 8.0, "regular");
*	AGrocery c3 = new Coffee("Colombian Supreme ", 1700, 9.5, "regular");
*		assertTrue(c1.cheaperThan(c2));
*		assertTrue(c2.cheaperThan(c3));
*		assertFalse(c3.cheaperThan(c1));
*	AGrocery j1 = new Juice("Orange Juice", 250, 10, "Orange", "bottled");
*	AGrocery j2 = new Juice("Banana Juice", 200, 9, "Banana", "fresh");
*	AGrocery j3 = new Juice("Apple Juice", 150, 7, "Apple", "bottled");
 * 		assertFalse(j1.cheaperThan(j2));
*		assertFalse(j2.cheaperThan(j3));
*		assertTrue(j3.cheaperThan(j1));
*	AGrocery b1 = new IceCream("CoconutCream", 100, 15, "Coconut", "sorbet");
*	AGrocery b2 = new IceCream("MilkCream", 150, 13, "Milk", "frozen yogurt");
*	AGrocery b3 = new IceCream("CocoaCream", 80, 12, "Cocoa", "sorbet");
*		assertTrue(b1.cheaperThan(b2));
*		assertFalse(b2.cheaperThan(b3));
*		assertFalse(b3.cheaperThan(b1));
 */
	public boolean cheaperThan(AGrocery other) {
		if(this.unitPrice() < other.unitPrice()) {
			return true;
		}else {
			return false;
		}
		
	}
}
