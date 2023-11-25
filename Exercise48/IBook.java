package Exercise48;

public interface IBook {
	public double salePrice();
	public boolean cheaperThan(ABook that);
	public boolean sameName(ABook other);
}
