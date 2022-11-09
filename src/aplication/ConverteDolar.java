package aplication;
import java.util.Locale;
import java.util.Scanner;

import util.Calculator;
import util.CurrencyConverter;
public class ConverteDolar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre cm o preo do Dolar ");
		double precodolar = sc.nextDouble();
		System.out.print("Entre cm a quantidade de Dolares ");
		double qtddolar = sc.nextDouble();
	
		double real = 	CurrencyConverter.convertedolar(precodolar , qtddolar);  // funcao
		
		System.out.printf("Valor em Real com Imposto : %.2f%n", real);
		
		sc.close();
		
	}

}
