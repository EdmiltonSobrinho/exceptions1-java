package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;
import entities.Company;
import entities.Individual;
public class Contribuinte {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<TaxPayer>();

		System.out.println("Enter the number of tax payers: - Número de Contribuintes ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Taxpayer - Contribuinte #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			
			if (type == 'i') {
				System.out.print("Health expenditures: - Gastos com Saúde ");
				Double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
		
		//      poderia  ser abaixo também
		//		Individual x = new Individual(name,anualIncome,healthExpenditures );
		//		list.add(x);
			}
			else {
				System.out.print("Number of Employees: - Número de empregados ");
				Integer numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
				}
		}
			
		System.out.println();
		System.out.println("TAXES PAID - (IMPOSTOS PAGOS):");
		for (TaxPayer tp : list) {
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
		}
	
		System.out.println();
		double sum = 0.0;
		for (TaxPayer tp : list) {
			sum += tp.tax();
		}
		System.out.println("TOTAL TAXES:- (TOTAL DE IMPOSTOS $ " + String.format("%.2f", sum));
		
		sc.close();
	}

	
}
