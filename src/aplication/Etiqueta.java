package aplication;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.ProductEtiq;
import entities.UsedProducts;

public class Etiqueta {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<ProductEtiq> list = new ArrayList<>();
		
		System.out.print("Enter number of produts :");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			System.out.println("Product #" + i + "data : ");
			System.out.println("Commom, - used or imported (c/u/i) :");
			char type = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
		
			if (type == 'c') {
				list.add(new ProductEtiq(name, price));
			}
			else if (type == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				list.add(new UsedProducts(name, price, date));
			}
			else {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
			
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (ProductEtiq prod : list) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();
		

	}

}