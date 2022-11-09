package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Funcionario {

	private static int idSalary;

	public Funcionario(Integer id, String name, Double salary) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		System.out.printf("Hou many Employes will to registred: ");
		int N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			System.out.println();
			System.out.println("Employe # " + (i + 1) + ":");
			System.out.printf("id :");
			Integer id = sc.nextInt();
			
			System.out.printf("Name :");
			sc.nextLine();  // limpa buffer de entrada
			String name = sc.nextLine();
			
			System.out.printf("Salary :");
			Double salary = sc.nextDouble();
			
			// instanciou a lista como vazia
			Funcionario emp = new Funcionario(id, name, salary);
			list.add(emp);  // inserir na lista
			
		}
		
		System.out.print("Enter the Employe id that will have salary increase");
		int idSalay = sc.nextInt();
		Integer pos = position(list, idSalary);  // faz a procura
		if (pos == null) {
			System.out.println("This id doe not exist? ");
		}
		else {
			System.out.println("Enter the percentage");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
			list.get(pos);
		}
		System.out.println();
		System.out.println("List of Employees");
		for (Funcionario emp : list) {
			System.out.print(emp);
		}
		
		
		
		sc.close();
	}

	// funcao auxiliar para procurar o elemento na lista

	public static Integer position(List<Funcionario> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

	private int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

}
