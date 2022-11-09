package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Employes;

public class Salario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employes employes = new Employes();
		System.out.println("Entre com os Dados abaixo: ");
		
		System.out.print("Nome Funcionário : ");
		employes.name = sc.nextLine();
		
		System.out.print("Salário : ");
		employes.grossSalary = sc.nextDouble();
		
		System.out.print("Taxa de desconto : ");
//		double tax = sc.nextDouble();
		employes.tax = sc.nextDouble();
		System.out.printf("Funcionario : %s $ %.2f%n", employes.name, employes.netSalary());
			
		// ok, 
		
//		System.out.println();   // pula linha
//		System.out.println(product.name + ", " + product.price + "," + product.quantity);
//		System.out.println(product.toString());  // tbm aceita retirando o toString();
//		System.out.println("Product data : "+ product);
//      or		
		System.out.print("Digite percentual de aumento : ");
		double tax = sc.nextDouble();
		employes.increaseSalary(tax);
		System.out.println(employes.grossSalary);
		
		System.out.println(employes.bruto);
		
		System.out.println("Funcionário : "+ employes.toString());
		
		sc.close();
	}

}
