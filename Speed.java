
public class Speed 
{
	private double distance;
	private double time;
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	
	public double getMPH()
	{
		double MPH = getDistance() / getTime();
		return MPH;
	}
}
