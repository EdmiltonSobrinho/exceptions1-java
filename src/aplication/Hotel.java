package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Hotel;

public class Hotel {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de vagas : ");
		int n = sc.nextInt();
		
		Hotel[] vect = new Hotel[n];  
		
		for (int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Digite o nome do aluno : ");
			String name = sc.nextLine();
			System.out.println("Digite o email do aluno");
			String email = sc.nextLine();
			System.out.println("Digite o quarto do aluno");
			Integer quarto = sc.nextInt();
			
			vect[i] = new Hotel();
		}
		
		
		int qt = 0.00;
		for (int i=0; i<n; i++) {
			qt += vect[i].getQuarto();
			
		}

	
		
		sc.close();


	}

	private integer getQuarto() {
		// TODO Auto-generated method stub
		return 0;
	}
}
