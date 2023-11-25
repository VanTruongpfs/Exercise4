package Exercise47;

public interface ITaxiVehicle {
	public double fare(int mile);
	public boolean lowerThan( int mile, int amount);
	public boolean cheaperThan(ATaxiVehicle other, int mile);
}
