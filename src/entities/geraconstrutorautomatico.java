package entities;
// botao direito source / generate constructor fields
// só para ilustrar
public class geraconstrutorautomatico {
	private String name;     
	private double price;
	private int quantity;
	// construtor padrao
	public geraconstrutorautomatico() {  
 	}
	
	// construtor gerado automaticamente apartir dos campos
	public geraconstrutorautomatico(String name, double price, int quantity) {
//		super();  // vai ver mais pra frente
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// construtor sobrecarga (modificado)
	public geraconstrutorautomatico(String name, double price ) { 
		this.name = name;
		this.price = price;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}
	public void addProducts(int quantity) {  // soma estoque
		this.quantity += quantity;  
	}

	public void removeProducts(int quantity) {  //diminui estoque
		this.quantity -= quantity;  
	}

	public String toString() {
		return name
				+ ", $"
				+ String.format("%.2f", price) // substituiu + price 
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());  // substituiu + totalValueInStock()
	}
}

