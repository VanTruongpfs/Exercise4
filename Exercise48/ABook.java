package Exercise48;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public abstract class ABook implements IBook {
	protected String title;
	protected String authorsName;
	protected double price;
	protected int publicationYear;
/**
 * this is a constructor of class ABook. There are 4 field
 * @param title
 * @param authorsName
 * @param price
 * @param publicationYear
 * exampla:
 * 	// this is a constructor of class HardCover
*		ABook h1 = new HardCover("The Great Gatsby", "F. Scott Fitzgerald", 25, 1925, 0.8);
*		ABook h2 = new HardCover("To Kill a Mockingbird", "Harper Lee", 20, 1960, 0.8);
*		ABook h3 = new HardCover("1984", "George Orwell", 15, 1949, 0.8);
* // this is a constructor of class Sale
*		ABook s1 = new Sale("Influence: The Psychology of Persuasion", "Robert Cialdini", 15, 2006, 0.5);
*		ABook s2 = new Sale("To Sell Is Human: The Surprising Truth About Moving Others", "Daniel H. Pink", 12, 2012, 0.5);
*		ABook s3 = new Sale("The Challenger Sale: Taking Control of the Customer Conversation", "Matthew Dixon and Brent Adamson", 20, 2011, 0.5);
* //this is a constructor of class PaperBack
*		PaperBack p1 = new PaperBack("Đắc Nhân Tâm", "Dale Carnegie", 10, 1936);
*		PaperBack p2 = new PaperBack("Bí Quyết Thành Công", "Napoleon Hill", 15, 1937);
*		PaperBack p3 = new PaperBack("Thế giới đã đổi thay bạn chưa?", "Robert T. Kiyosaki", 20, 2005);
 */
	public ABook(String title, String authorsName, double price, int publicationYear) {
		this.title = title;
		this.authorsName = authorsName;
		this.price = price;
		this.publicationYear = publicationYear;
	}
/**
 * this is a method salePrice() of class ABook
 * example:
 * // this is testing method salePrice() for HardCover
*		ABook h1 = new HardCover("The Great Gatsby", "F. Scott Fitzgerald", 25, 1925, 0.8);
*		ABook h2 = new HardCover("To Kill a Mockingbird", "Harper Lee", 20, 1960, 0.8);
*		ABook h3 = new HardCover("1984", "George Orwell", 15, 1949, 0.8);
*			assertEquals(h1.salePrice(), 20);
*			assertEquals(h2.salePrice(), 16);
*			assertEquals(h3.salePrice(), 12);
*	// this is testing method salePrice() for HardCover
*		ABook s1 = new Sale("Influence: The Psychology of Persuasion", "Robert Cialdini", 15, 2006, 0.5);
*		ABook s2 = new Sale("To Sell Is Human: The Surprising Truth About Moving Others", "Daniel H. Pink", 12, 2012, 0.5);
*		ABook s3 = new Sale("The Challenger Sale: Taking Control of the Customer Conversation", "Matthew Dixon and Brent Adamson", 20, 2011, 0.5);
*			assertEquals(s1.salePrice(), 7.5);
*			assertEquals(s2.salePrice(), 6);
*			assertEquals(s3.salePrice(), 10);
* // this is testing method salePrice() for HardCover
*		ABook p1 = new PaperBack("Đắc Nhân Tâm", "Dale Carnegie", 10, 1936);
*		ABook p2 = new PaperBack("Bí Quyết Thành Công", "Napoleon Hill", 15, 1937);
*		ABook p3 = new PaperBack("Thế giới đã đổi thay bạn chưa?", "Robert T. Kiyosaki", 20, 2005);
*			assertEquals(p1.salePrice(), 10);
*			assertEquals(p2.salePrice(), 15);
*			assertEquals(p3.salePrice(), 20);
* input:
* output: double
 */
	public abstract double salePrice();
/**
 * this is a method cheaperThan() of class ABook
 * @return
 * example:
 * //this is tesing method cheaperThan() for HardCover
 * 	ABook h1 = new HardCover("The Great Gatsby", "F. Scott Fitzgerald", 25, 1925, 0.8);
*	ABook h2 = new HardCover("To Kill a Mockingbird", "Harper Lee", 20, 1960, 0.8);
*	ABook h3 = new HardCover("1984", "George Orwell", 15, 1949, 0.8);
*		assertFalse(h1.cheaperThan(h2));
*		assertFalse(h2.cheaperThan(h3));
*		assertTrue(h3.cheaperThan(h1));
*  //this is tesing method cheaperThan() for Sale
*	ABook s1 = new Sale("Influence: The Psychology of Persuasion", "Robert Cialdini", 15, 2006, 0.5);
*	ABook s2 = new Sale("To Sell Is Human: The Surprising Truth About Moving Others", "Daniel H. Pink", 12, 2012, 0.5);
*	ABook s3 = new Sale("The Challenger Sale: Taking Control of the Customer Conversation", "Matthew Dixon and Brent Adamson", 20, 2011, 0.5);
*		assertFalse(s1.cheaperThan(s2));
*		assertTrue(s2.cheaperThan(s3));
*		assertFalse(s3.cheaperThan(s1));
* //this is tesing method cheaperThan() for PaperBack
*	ABook p1 = new PaperBack("Đắc Nhân Tâm", "Dale Carnegie", 10, 1936);
*	ABook p2 = new PaperBack("Bí Quyết Thành Công", "Napoleon Hill", 15, 1937);
*	ABook p3 = new PaperBack("Thế giới đã đổi thay bạn chưa?", "Robert T. Kiyosaki", 20, 2005);
*		assertTrue(p1.cheaperThan(p2));
*		assertTrue(p2.cheaperThan(p3));
*		assertFalse(p3.cheaperThan(p1));
*	input: ABook that
*	output: boolean
*
 */
	public boolean cheaperThan(ABook that) {
		if(this.salePrice() < that.salePrice() ){
			return true;
		}else {
			return false;
		}
	}
/**
 * this is a method sameName of class ABook
 * @return
* //this is tesing method sameName() for HardCover
* 	ABook h1 = new HardCover("The Great Gatsby", "F. Scott Fitzgerald", 25, 1925, 0.8);
*	ABook h2 = new HardCover("To Kill a Mockingbird", "Harper Lee", 20, 1960, 0.8);
*	ABook h3 = new HardCover("1984", "George Orwell", 15, 1949, 0.8);
*		assertTrue(h1.sameName(h1));
*		assertFalse(h1.sameName(h2));
*		assertFalse(h2.sameName(h3));
 * //this is tesing method sameName() for Sale
*	ABook s1 = new Sale("Influence: The Psychology of Persuasion", "Robert Cialdini", 15, 2006, 0.5);
*	ABook s2 = new Sale("To Sell Is Human: The Surprising Truth About Moving Others", "Daniel H. Pink", 12, 2012, 0.5);
*	ABook s3 = new Sale("The Challenger Sale: Taking Control of the Customer Conversation", "Matthew Dixon and Brent Adamson", 20, 2011, 0.5);
*		assertTrue(s1.sameName(s1));
*		assertFalse(s1.sameName(s2));
*		assertFalse(s2.sameName(s3));
* //this is tesing method sameName() for PaperBack
*	ABook p1 = new PaperBack("Đắc Nhân Tâm", "Dale Carnegie", 10, 1936);
*	ABook p2 = new PaperBack("Bí Quyết Thành Công", "Napoleon Hill", 15, 1937);
*	ABook p3 = new PaperBack("Thế giới đã đổi thay bạn chưa?", "Robert T. Kiyosaki", 20, 2005);
*		assertTrue(p1.sameName(p1));
*		assertFalse(p1.sameName(p2));
*		assertFalse(p2.sameName(p3));
*	input: ABook other
*	output: boolean
 */
	public boolean sameName(ABook other) {
		if(this.authorsName.equals(other.authorsName)) {
			return true;
		}else {
			return false;
		}
	}
}
