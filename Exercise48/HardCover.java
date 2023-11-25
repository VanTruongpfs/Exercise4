package Exercise48;

public class HardCover extends ABook {
	private double priceOff;
/**
 * this is a constructor of class HardCover. There are 5 field 
 * @param title
 * @param authorsName
 * @param price
 * @param publicationYear
 * @param priceOff
 *	example:
 *	new HardCover("The Great Gatsby", "F. Scott Fitzgerald", 25, 1925, 0.8);
 *	new HardCover("To Kill a Mockingbird", "Harper Lee", 20, 1960, 0.8);
 *	new HardCover("1984", "George Orwell", 15, 1949, 0.8);
 *	
 */
	public HardCover(String title, String authorsName, double price, int publicationYear, double priceOff) {
		super(title, authorsName, price, publicationYear);
		this.priceOff = priceOff;
	}
/**
 * this is a method salePrice of class HardCover
 * @return
 * example:
 * 	new HardCover("The Great Gatsby", "F. Scott Fitzgerald", 25, 1925, 0.8);
 *	new HardCover("To Kill a Mockingbird", "Harper Lee", 20, 1960, 0.8);
 *	new HardCover("1984", "George Orwell", 15, 1949, 0.8);
 *   HardCover h1 = new HardCover("The Great Gatsby", "F. Scott Fitzgerald", 25, 1925, 0.8);
 *	 HardCover h3 = new HardCover("To Kill a Mockingbird", "Harper Lee", 20, 1960, 0.8);
 *	 HardCover h3 = new HardCover("1984", "George Orwell", 15, 1949, 0.8);
 *		assertEquals(h1.salePrice(), 20);
 *		assertEquals(h2.salePrice(), 16);
 *		assertEquals(h3.salePrice(), 12);
 *input:
* output: double
 */
	public double salePrice() {
		return this.price * this.priceOff;
	}
}
