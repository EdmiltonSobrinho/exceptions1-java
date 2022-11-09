package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("digite a quantidade" );
		int n = sc.nextInt();
		double[] vect = new double[n];  // instanciou
		for (int i=0; i<n; i++) {
			System.out.println("informe o vetor "+ (i+1));
			vect[i] = sc.nextDouble();
		}
	
		double sum = 0.00;
		for (int i=0; i<n; i++) {
			sum += vect[i];
		}

		double avg = 0.00;
		avg = sum / n;
		System.out.println("resultado " + avg);
//		System.out.printf("Average Heith : %.nf%n" , avg);
		
		sc.close();
	}

}
