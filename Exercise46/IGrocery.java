package Exercise46;

public interface IGrocery {
	public double unitPrice();
	public boolean lowerPrice(double givenAmount);
	public boolean cheaperThan(AGrocery other);
}
