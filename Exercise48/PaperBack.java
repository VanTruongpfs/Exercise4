package Exercise48;

public class PaperBack extends ABook {
/**
 * this is a constructor of class PaperBack. There are 4 field
 * @param title
 * @param authorsName
 * @param price
 * @param publicationYear
 * example:
 *  new PaperBack("Đắc Nhân Tâm", "Dale Carnegie", 10, 1936);
 *  new PaperBack("Bí Quyết Thành Công", "Napoleon Hill", 15, 1937);
 *  new PaperBack("Thế giới đã đổi thay bạn chưa?", "Robert T. Kiyosaki", 20, 2005);
 */
	public PaperBack(String title, String authorsName, double price, int publicationYear) {
		super(title, authorsName, price, publicationYear);
	}
/**
 * this is a method salePrice() of class PaperBack
 * @return
 * example:
 * 	new PaperBack("Đắc Nhân Tâm", "Dale Carnegie", 10, 1936);
 *  new PaperBack("Bí Quyết Thành Công", "Napoleon Hill", 15, 1937);
 *  new PaperBack("Thế giới đã đổi thay bạn chưa?", "Robert T. Kiyosaki", 20, 2005);
 *   PaperBack p1 = new PaperBack("Đắc Nhân Tâm", "Dale Carnegie", 10, 1936);
 *   PaperBack p2 = new PaperBack("Bí Quyết Thành Công", "Napoleon Hill", 15, 1937);
 *   PaperBack p3 = new PaperBack("Thế giới đã đổi thay bạn chưa?", "Robert T. Kiyosaki", 20, 2005);
 *   	assertEquals(p1.salePrice(), 10);
 *   	assertEquals(p2.salePrice(), 15);
 *   	assertEquals(p3.salePrice(), 20);
* input:
* output: double
 */
	public double salePrice() {
		return this.price;
	}
}
