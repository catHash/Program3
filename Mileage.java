
public class Mileage 
{
	private double Miles;
	private double Gallons;
	
	public double getMiles() {
		return Miles;
	}
	public void setMiles(double miles) {
		Miles = miles;
	}
	public double getGallons() {
		return Gallons;
	}
	public void setGallons(double gallons) {
		Gallons = gallons;
	}
	public double getMPG() 
	{
		double MPG = (getMiles() / getGallons());
		return MPG;
	}
	
	

}
