package coom.example;

public abstract class Transport {
	private double src;
	private double dst;
	private double speed;

	public abstract double calculateDistance(double src,double dst);
     

public abstract double fuelEfficieny(double initialFuel, double fuelNow);

}
