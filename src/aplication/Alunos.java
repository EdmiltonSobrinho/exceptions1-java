package aplication;
import java.util.Locale;
import java.util.Scanner;

import entities.Employes;
import entities.NotasTrim;

public class Alunos {

//	public static void main(String[] args) {   // primeiro esboço
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//		NotasTrim notastrim = new NotasTrim();
//		System.out.println("Entre com os Dados do aluno: ");
//		
//		System.out.printf("Entre com o Nome: ");
//		notastrim.name = sc.nextLine();
//		
//
//		//	while (num > 0) {
//		//		soma = soma + num;
//		//	    num = sc.nextInt();
//		//	}
//		
//		int n = 3;
//		double media = 0;
//		for (int i=1; i<=n; i++) {
 //   
//			System.out.println("Entre com a nota: "+ i);
//			notastrim.notas = sc.nextDouble();
//			media = media + notastrim.notas;
//		}
//		
//		double resultado = media / 3;
//		if (resultado >=60) {
//			System.out.println("FINAL GRADE = "+media);
//			System.out.println("PASS");
//		} else {
//			System.out.println("FINAL GRADE = "+media);
//			System.out.println("FAILLED ");
//			System.out.println("MISSING "+ (60 - media));
//		}

///////////////////////// correto 100 metodo ///////////////////////////////////////////////////

//		public static void main(String[] args) {
//			Locale.setDefault(Locale.US);
//			Scanner sc = new Scanner(System.in);
//			
//			NotasTrim notastrim = new NotasTrim();
//			System.out.println("Entre com os Dados do aluno: ");
//			
//			System.out.printf("Entre com o Nome: ");
//			notastrim.name = sc.nextLine();
//
//			
//			int n = 3;
//			double notast = 0;
//			for (int i=1; i<=n; i++) {
//	    
//				System.out.println("Entre com a nota: "+ i);
//				notast = sc.nextDouble();
//				
//				notastrim.addNotas(notast);  // chama o metodo
//			}
//			
//			notastrim.mediaNotas(notastrim.notas);  // chama o metodo
//
//			if (notastrim.notas >=60) {
//				System.out.println("FINAL GRADE = "+notastrim.notas);
//				System.out.println("PASS");
//			} else {
//				System.out.println("FINAL GRADE = "+notastrim.notas);
//				System.out.println("FAILLED ");
//				System.out.println("MISSING "+ (60 - notastrim.notas));
//			}
////////////////  aperfeicoando o metodo ////////////////////////////////////

			public static void main(String[] args) {
				Locale.setDefault(Locale.US);
				Scanner sc = new Scanner(System.in);
				
				NotasTrim notastrim = new NotasTrim();
				System.out.println("Entre com os Dados do aluno: ");
				
				System.out.printf("Entre com o Nome: ");
				notastrim.name = sc.nextLine();

				
				int n = 3;
				double notast = 0;
				for (int i=1; i<=n; i++) {
					System.out.println("Entre com a nota: "+ i);
					notast = sc.nextDouble();
					notastrim.addNotas(notast);  // chama o metodo
				}
				
				notastrim.mediaNotas(notastrim.notas);  // chama o metodo

				if (notastrim.notas >=60) {
					System.out.println("FINAL GRADE = "+notastrim.notas);
					System.out.println(notastrim.resultado);
				} else {
					System.out.println("FINAL GRADE = "+notastrim.notas);
					System.out.println(notastrim.resultado);
		//			System.out.println("MISSING "+ (60 - notastrim.notas));
					System.out.println("MISSING " + notastrim.diferenca);
				}

				System.out.println(notastrim.toString());
				
		sc.close();
	}

}
