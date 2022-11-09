package entities;
// ficou no lugar do employes original
public class Employes2 {

}
package entities;

public class Employes {
	public String name;
	public double grossSalary;
	public double tax;
	public double bruto;
	public double percent;
	
	public double netSalary() {
	    
		this.bruto = grossSalary;
		return grossSalary -= tax;
	}
	
	public void increaseSalary(double tax) {  // soma ao salario
		this.percent = tax;
		this.grossSalary += (bruto * tax) / 100;
	}
	
	public String toString() {
		return name
				+ ", Bruto: $ "
				+ String.format("%.2f", bruto) 
				+ ", Desconto $ "
		//		+ tax
				+ String.format("%.2f", tax) 
				+ " , Percentual aumento % "
				+ percent
				+ ", Salário: $ "
		//		+ String.format("%.2f", increaseSalary()); // nao consegui ver depois
			    + grossSalary;
			
	}
}

//id 333 Maria 4000.00
//id 536 Alex  3000.00
//id 772 Bob   5000.00
