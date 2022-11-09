package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite qtd de elementos da matriz ");
		int n = sc.nextInt();
		
		int [][] mat = new int [n][n]; // cria matriz bidimensional
//		for (int i=0; i<n; i++) { // igual ao de baixo
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal :");
//		for (int i=0; i<n; i++) {   // igual ao de baixo
		for (int i=0; i<mat.length; i++) { 	
			System.out.println(mat[i][i] + " ");
		}
		
		int count = 0;
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (mat[i][j] < 0) {
					count ++;
				}
			}
		}
		System.out.println("Negative numbert "+ count);
		
		sc.close();
		
	}

	}
