package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeePoli;
import entities.EmprloyesExtra;
import entities.OutsourcedEmployeeExtra;

public class FuncionarioExtra {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// criou a lista
		List<EmprloyesExtra> list = new ArrayList<>();
		
		System.out.print("Enter the number of employess ?");
		// acessa e preenche a lista
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("Employee # " + i + " Data : ");

			System.out.println("Outsourced (y/n) ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.println("Hours");
			int hours = sc.nextInt();
			
			System.out.println("Value per Hour : ");
			double valuePerHour = sc.nextDouble();
			
			if (ch == 'y' ) {
				System.out.print("Additional Charge: ");
				double additionalCharge = sc.nextDouble();
				// instanciou a lista - importantissimo
				EmprloyesExtra emp = new OutsourcedEmployeeExtra(name, hours, valuePerHour, additionalCharge);
				// adicionou a lista - importantissimo
				list.add(emp); // ou list.add(new OutsourcedEmployeeExtra(name, hours, valuePerHour, additionalCharge))
			                   // nesse caso não precisaria da variavel emp - idem abaixo
			}
			else {
				EmprloyesExtra emp = new EmprloyesExtra(name, hours, valuePerHour);
				list.add(emp);
			}
		}
		System.out.println();
		System.out.println("Payments : ");
		
		// percorrer a lista e imprimir
		for(EmprloyesExtra emp : list) {
			System.out.println(emp.getName()+ " - $ " + String.format("%.2f", emp.payment()));
			
		}
		
		
		sc.close();
	}

}
