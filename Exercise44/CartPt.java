package Exercise44;

public class CartPt {
	private int x;
	private int y;
/**
 * this is a constructor of class CartPt. There are 4 field
 * @param x
 * @param y
 * example:
 * 	new CartPt(3,4);
 * 	new CartPt(6,8);
 * 	new CartPt(2,3);
 */
	public CartPt(int x, int y) {
		this.x = x;
		this.y = y;
	}
 public int getX() {
	 return this.x;
 }
 public int getY() {
	 return this.y;
 }
}
