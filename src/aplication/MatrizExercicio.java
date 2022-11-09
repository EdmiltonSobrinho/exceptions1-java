package aplication;

import java.util.Locale;
import java.util.Scanner;

public class MatrizExercicio {


	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Informe quantidade de Linhas (M)");
		int  m = sc . nextInt ();
		System.out.println("Informe quantidade de Colunas (N)");
		int  n = sc . nextInt ();
		int [][] mat = new  int [ m ][ n ]; // instanciou matriz
		
		for ( int  i = 0 ; i < mat.length ; i ++) {
			for ( int  j = 0 ; j < mat [ i ].length ; j ++) {
				mat [ i ][ j ] = sc . nextInt ();
			}
		}
		
		System.out.println("Informe o número a ser pesquisado: ");
		int  x = sc . nextInt ();
/////
	
		for ( int  i = 0 ; i < mat.length ; i ++) {
			for ( int  j = 0 ; j < mat [ i ].length; j ++) {
				if ( mat [ i ][ j ] == x ) {
					System.out.println ( "Position " + i + "," + j + ":" );
				}
				else {
					if ( j > 0 ) {
						System.out.println ( "Left: " + mat [ i ][ j - 1 ]);
					}
					else {
						if ( i > 0 ) {
							System.out.println ( "Up:" + mat [ i - 1 ][ j ]);
						}
					 {
							if ( j < mat [ i ].length - 1 ) {
								System.out.println ( "Right: " + mat [ i ][ j + 1 ]);
							}
							else {
								if ( i < mat.length - 1 ) {
									System.out.println ( "Down" + mat [ i + 1 ][ j ]);
								}
							}
						}
					}
/////

		sc.close();
	}
	
		}
	}
		System.out.println("..................");
		System.out.println("Concluido - não está correto - verificar ");
}
	
}
///// depois testar da forma abaixo

//if (mat[i][j] == x) {
//	System.out.println("Position " + i + "," + j + ":");
//	if (j > 0) {
//		System.out.println("Left: " + mat[i][j-1]);
//	}
//	if (i > 0) {
//		System.out.println("Up: " + mat[i-1][j]);
//	}
//	if (j < mat[i].length-1) {
//		System.out.println("Right: " + mat[i][j+1]);
//	}
//	if (i < mat.length-1) {
//		System.out.println("Down: " + mat[i+1][j]);
//	}
//}