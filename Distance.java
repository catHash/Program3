
public class Distance 
{
	private double Speed;
	private double Time;
	public double getSpeed() {
		return Speed;
	}
	public void setSpeed(double speed) {
		this.Speed = speed;
	}
	public double getTime() {
		return Time;
	}
	public void setTime(double time) {
		this.Time = time;
	}
	
	public double getDistance()
	{
		double distance = getSpeed() * getTime();
		return distance;
	}
}
