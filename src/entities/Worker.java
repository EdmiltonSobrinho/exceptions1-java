package entities;
// classe trabalhador conforme diagrama
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	// fez a Composição de objetos / departamento e do contrato
	private Department department;
	
	// associar a lista na declaraçao abaixo
	//private List<HourContract> contracts;  // deveria mais inclui abaixo
	private List<HourContract> contracts = new ArrayList<>(); // inicia a lista vazia
	
	// construtor padrao
	public Worker() {
		
	}

	// construtor com parametros sem a lista
	
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
	//	super();
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	//   nao pode ficar porque já está associada aos metodos
	//   addcontract e removecontract
	//public void setContracts(List<HourContract> contracts) {
	//	this.contracts = contracts; porque ela foi incializada antes
	//}
	
	// IMPLEMENTACAO DOS METODOS
	// adicionar a lista
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	// remover da lista
	public void removeContract(HourContract contract) {
		contracts.add(contract);
	}
    // calcular na lista
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance(); //para pegar a data 
		for (HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			
			if (year == c_year && month == c_month) {
			   sum += c.totalValue();
			}
		}
		return sum;
	}
}	
		