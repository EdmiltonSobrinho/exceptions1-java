package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
// import entities.Worker;
// classe principal do conrato 

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;
 
public class ContratoHora  {
	
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		System.out.print("Enter departament's name :");
		String departmentName = sc.nextLine();
		
		System.out.println("Enter Wordk data:");
		System.out.print("Name : ");
		String workName = sc.nextLine();
		
		System.out.print("Level : ");
		String workLevel = sc.nextLine();
		System.out.print("Base Salary : ");
		Double baseSalary = sc.nextDouble();
		Worker worker = new Worker(workName, WorkerLevel.valueOf(workLevel), baseSalary, new Department(departmentName));
		
		System.out.print("Wow many contracts this worker: ");		
		int n = sc.nextInt();
		
		for (int i=1; i<n; i++ ) {
			System.out.println("Enter contract # "+ i + "Data:");
			System.out.print("Date (dd/mm/yyy");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour : ");
			Double valuePerhour = sc.nextDouble();
			
			System.out.print("Duration hour : ");
			Double valuePerHour = sc.nextDouble();
			int hours = sc.nextInt();
			// instanciou o contrato;
			HourContract contract = new HourContract( contractDate, valuePerHour, hours);
			// associou o contrato com o trabalhador
			worker.addContract(contract);
			
		}
		System.out.println();
		System.out.print("Enter monther and year to calculate income (dd/mm/yyy/)");
		String montAndYear = sc.next();
		// converte para instring depois inteiro
		int month = Integer.parseInt(montAndYear.substring(0,2));
		int year  = Integer.parseInt(montAndYear.substring(3));
		
		System.out.println("Name :" + worker.getName());
		System.out.println("Department : " + worker.getDepartment().getName());
		System.out.println("Income for " + montAndYear + " : " + String.format("%.2f", worker.income(month, year)));
		
		sc.close();
		
	}

}
