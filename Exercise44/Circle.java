package Exercise44;

public abstract class Circle extends AShape {
	private int radius;
/**
 * this is a constructor of class Circle. There are 2 field
 * @param location
 * @param radius
  * example:
 * 	 new Circle(new CartPt(3,4),1);
 * 	 new Circle(new CartPt(6,8),2);
 * 	 new Circle(new CartPt(2,3),3);
 */
	public Circle(CartPt location, int radius) {
		super(location);
		this.radius = radius;
	}
/**
 * this is a method of class Circle
 * @return
 * example:
 * 	 new Circle(new CartPt(3,4),1);
 * 	 new Circle(new CartPt(6,8),2);
 * 	 new Circle(new CartPt(2,3),3);
 * 	  Circle c1 = new Circle(new CartPt(3,4),1);
 * 	  Circle c2 = new Circle(new CartPt(6,8),2);
 * 	  Circle c3 = new Circle(new CartPt(2,3),3);
 * 		assertEquals(c1.area(),Math.PI*1);
 * 		assertEquals(c2.area(),Math.PI*4);
 * 		assertEquals(c3.area(),Math.PI*9);
 */
	public double area() {
		return Math.PI*Math.pow(this.radius, 2);
	}
	

}
