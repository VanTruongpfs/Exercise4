package Exercise44;

public abstract class AShape implements IShape {
	protected CartPt location;
/**
 * this is a constructor of class. There are 1 field
 * @param location
 */
	public AShape(CartPt location) {
		this.location = location;
	}
	public abstract int are();
/**
 * this is a method distanceToO() of class AShape
 * @return
 * example:
 */
	public double distanceToO() {
		return Math.sqrt(Math.pow( this.location.getX(), 2) + Math.pow( this.location.getX(), 2));
		
	}
}
