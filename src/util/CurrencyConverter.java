package util;

public class CurrencyConverter {
	public  static final double IMPOSTO = 6.00;
	
	public static double convertedolar(double precodolar, double qtddolar) {
		double total = ( qtddolar * precodolar);
		double res = total + (total * IMPOSTO /100);
		return res;
		
//		return ( qtddolar * precodolar);

	}
//	public static double volume(double radius) {
//		return (4.0 * PI * radius * radius * radius) / 3.0;
//  }	
	
}
