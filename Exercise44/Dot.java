package Exercise44;

public abstract class Dot extends AShape{
/**
 * this is a constructor of class Dot. There are 1 field
 * @param location
 * example:
 *  new Dot(new CartPt(3,4));
 *  new Dot(new CartPt(6,8));
 *  new Dot(new CartPt(2,3));
 */
	public Dot(CartPt location) {
		super(location);
	}
}
