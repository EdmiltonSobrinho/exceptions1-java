package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data :");

		System.out.print("Name : ");
		product.name = sc.nextLine();
		System.out.print("Price : ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in Stock : ");
		product.quantity = sc.nextInt();

		System.out.println();   // pula linha
//		System.out.println(product.name + ", " + product.price + "," + product.quantity);
//		System.out.println(product.toString());  // tbm aceita retirando o toString();
//		System.out.println("Product data : "+ product);
//      or		
		System.out.println("Product data : "+ product.toString());
		
		System.out.println();   // pula linha  eentrada no estoque
		System.out.println("Enter the number of product to be add in stock :");
		int quantity = sc.nextInt();
		product.addProducts(quantity);  // chama o metodo
		System.out.println(); 
		System.out.println("Update data : "+ product);
		
		System.out.println();   // pula linha saida no estoque
		System.out.println("Enter the number of product to be removed in stock :");
		quantity = sc.nextInt();
		product.removeProducts(quantity);  // chama o metodo
		System.out.println(); 
		System.out.println("Update data : "+ product);
		
		
		sc.close();
			
	}

}
