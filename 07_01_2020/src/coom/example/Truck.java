package coom.example;

public class Truck extends Transport {
	private double tmp;
	public  double calculateDistance(double src,double dst)
{
		tmp=dst-src;
	  return tmp;
}

public  double fuelEfficieny(double initialFuel, double fuelNow) {
	double fuelConsumed=initialFuel-fuelNow;
	double effciency=calculateDistance(100,200)/fuelConsumed;
	return tmp/effciency;
}

}
