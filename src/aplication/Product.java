package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Product {

	public Product(String name, double price) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Quantidade de itens : ");
		int n = sc.nextInt();
//		double[] vect = new double[n];  // instanciou s/classe
		Product[] vect = new Product[n]; // instanciou c/classe
		
		for (int i=0; i<n; i++) {
			sc.nextLine();
			
			System.out.println("Name : ");
			String name = sc.nextLine();
		
			System.out.println("Price : ");
			double price = sc.nextDouble();
			
			vect[i] = new Product(name, price); //instnc produto
		}
		
		
		double sum = 0.0;
		for (int i=0; i<n; i++) {
			System.out.println("I="+i);
			sum += vect[i].getPrice();
			System.out.println("Resultado do I ");
		}
		System.out.println("Resultado da soma  = "+ sum);
		
		double avg = sum / n;
		System.out.printf("Resultado = %.2f%n", avg);

		sc.close();

	}

	private double getPrice() {
		return 0;
	}

}
