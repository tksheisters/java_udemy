package entities;

public class Triangle {

	public double a;
	public double b;
	public double c;
	
	public double area() {
		double p = (a + b + c) / 2.00;
		double r = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return r;
	}

	

}
