package entities;

public class NotasTrim {
	public String name;
	public double notas;
	public double diferenca;
	public String resultado;

	public void addNotas(double notas) {  
		this.notas += notas;  
	}

//	public double missingPoints() {   // exemplo do professor
//		if (finalGrade() < 60.0) {
//			return 60.0 - finalGrade();
//		}
//		else {
//			return 0.0;
//			}
//		}

	public void mediaNotas(double resultado) { 
		if (notas >=60) {
			this.resultado = "PASS";
		} 
		else {
			this.resultado = "FAILED";
			this.diferenca = 60 - notas; 
		}
	
	}
	
	public String toString() {
		if (notas >=60) {
			return  "FINAL GRADE (toString) = "
				+ String.format("%.2f", notas)
				+ "  Situação : "
				+ resultado;
		}
		else {
			return  "FINAL GRADE (toString)= "
					+ String.format("%.2f", notas)
					+ "  Situação : "
					+ resultado
					+ " - MISSING "
					+ String.format("%.2f", diferenca);
		}

	}

}
