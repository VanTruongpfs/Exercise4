package Exercise48;

public class Sale extends ABook {
	private double priceOff;
/**
 * this is a constructor of class Sale. There are 5 field
 * @param title
 * @param authorsName
 * @param price
 * @param publicationYear
 * @param priceOff
 * example:
 * 	new Sale("Influence: The Psychology of Persuasion", "Robert Cialdini", 15, 2006, 0.5);
 * 	new Sale("To Sell Is Human: The Surprising Truth About Moving Others", "Daniel H. Pink", 12, 2012, 0.5);
 * 	new Sale("The Challenger Sale: Taking Control of the Customer Conversation", "Matthew Dixon and Brent Adamson", 20, 2011, 0.5);
 */
	public Sale(String title, String authorsName, double price, int publicationYear, double priceOff) {
		super(title, authorsName, price, publicationYear);
		this.priceOff = priceOff;
	}
/**
 * this is a method salePrice of class Sale
 * @return
 * example:
 * 	new Sale("Influence: The Psychology of Persuasion", "Robert Cialdini", 15, 2006, 0.5);
 * 	new Sale("To Sell Is Human: The Surprising Truth About Moving Others", "Daniel H. Pink", 12, 2012, 0.5);
 * 	new Sale("The Challenger Sale: Taking Control of the Customer Conversation", "Matthew Dixon and Brent Adamson", 20, 2011, 0.5);
 *   Sale s1 = new Sale("Influence: The Psychology of Persuasion", "Robert Cialdini", 15, 2006, 0.5);
 * 	 Sale s2 = new Sale("To Sell Is Human: The Surprising Truth About Moving Others", "Daniel H. Pink", 12, 2012, 0.5);
 * 	 Sale s3 = new Sale("The Challenger Sale: Taking Control of the Customer Conversation", "Matthew Dixon and Brent Adamson", 20, 2011, 0.5);
 * 		assertEquals(s1.salePrice(), 7.5);
 * 		assertEquals(s2.salePrice(), 6);
 * 		assertEquals(s3.salePrice(), 10);
 * input:
*  output: double
 */
	public double salePrice() {
		return this.price*this.priceOff;
	}
}
