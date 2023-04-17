package entity;

public class CurrencyConverter {
	public static final double iof = 0.06;

	public static double converter(double p, double d) {
		return (p * d) * iof + (p * d);
	}
}
