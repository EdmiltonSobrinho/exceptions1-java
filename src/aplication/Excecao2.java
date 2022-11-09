package aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao2 {

	public static void main(String[] args) {
		method1();
		
		System.out.println("End of programa");
	}
	
	private static void method1() {
		System.out.println("*** METODO1 START");
		method2();
		System.out.println("*** METODO1 END");
		
	}
	
	private static void method2() {
		System.out.println("*** METODO2 START");	
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position");
			e.printStackTrace(); // se colocar mostra erros com mais detalhes
			
			sc.next();
			
		}
		catch(InputMismatchException e) {
			System.out.println("Input error ");
		}
					
		sc.close();
		System.out.println("*** METODO2 END");
	}

}
