package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

/// parte 1
//public class Estaticos {
//	public static final double PI = 3.14159;  // constante é com letra maiuscula ou ex:PI_XXXXXX
//	
//	public static void main(String[] args) {
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Entre cm o Raio");
//		double radius = sc.nextDouble();
//
//		double c = 	circunference(radius);
//		double v = 	volume(radius);
//		
//		System.out.printf("Circuference : %.2f%n", c);
//		System.out.printf("Volume : %.2f%n", v);
//		System.out.printf("PI value : %.2f%n", PI);
//		
//		sc.close();
//	}
//	
//	public static double circunference(double radius) {
//		return 2.0 * PI * radius;
//	}
//	public static double volume(double radius) {
//		return (4.0 * PI * radius * radius * radius) / 3.0;
//		
//	}
//}

//////////////////////////////////////////////////////

/// parte 2
//public class Estaticos {
//	
//	public static void main(String[] args) {
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//		Calculator calc = new Calculator(); // instanciou
//
//		System.out.print("Entre cm o Raio");
//		double radius = sc.nextDouble();
//	
//		double c = 	calc.circunference(radius);  // funcao
//		double v = 	calc.volume(radius);         // funcao
//		
//		System.out.printf("Circuference : %.2f%n", c);
//		System.out.printf("Volume : %.2f%n", v);
//		System.out.printf("PI value : %.2f%n", calc.PI);  
//		
//		sc.close();
//		
//	}
//
//}

/////////////////////////////////////////////////////// 3
/// parte 3
public class Estaticos {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre cm o preo do Dolar ");
		double precoDolar = sc.nextDouble();
		System.out.print("Entre cm a quantidade de Dolares ");
		double qtdDolar = sc.nextDouble();
	
		double real = 	Calculator.circunference(precoDolar,qtdDolar);  // funcao
//		double v = 	Calculator.volume(radius);         // funcao
		
		System.out.printf("Circuference : %.2f%n", c);
		System.out.printf("Volume : %.2f%n", v);
		System.out.printf("PI value : %.2f%n", Calculator.PI);  
		
		sc.close();
		
	}

}
