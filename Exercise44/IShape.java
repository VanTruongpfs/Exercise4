package Exercise44;

public interface IShape {
	public double area();
	public double distanceToO();
	public boolean contains(CartPt point);
	public Square boundingBox();
	public double perimeter();
 
}
