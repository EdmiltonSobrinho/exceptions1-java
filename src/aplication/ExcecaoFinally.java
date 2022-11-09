package aplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExcecaoFinally {

	public static void main(String[] args) {
		File file = new File("c:\\temp\\in.txt");
		//File file = new File("c:\\temp\\in2.txt"); // da execao pq nao existe
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("Erro opening file " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("Finally block executable ");
		}
		
	}

}
