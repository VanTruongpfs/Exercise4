package Exercise44;

public abstract class Square extends AShape{
	private int size;
/**
 * this is a constructor of class Square. There are 2 field
 * @param location
 * @param size
 * example:
 * 	new Square(new CartPt(3,4),2);
 * 	new Square(new CartPt(6,8),3);
 * 	new Square(new CartPt(2,3),4);
 */
	public Square(CartPt location, int size) {
		super(location);
		this.size = size;
	}
/**
 * this is a method area() of class Square
 * @return
 * example:
 * 	new Square(new CartPt(3,4),2);
 * 	new Square(new CartPt(6,8),3);
 * 	new Square(new CartPt(2,3),4);
 * 	Square s1 = new Square(new CartPt(3,4),2);
 * 	Square s2 = new Square(new CartPt(6,8),3);
 * 	Square s3 = new Square(new CartPt(2,3),4);
 * 		assertEquals(s1.area(),4);
 * 		assertEquals(s2.area(),9);
 * 		assertEquals(s3.area(),16);
 */
	public double area() {
		return Math.pow(this.size,2);
	}
	
	

}
