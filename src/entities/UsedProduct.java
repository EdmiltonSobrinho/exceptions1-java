package entities;

import java.util.Date;

public class UsedProduct {
	private Date manufactureDate;
	
	public UsedProduct() {
		
	}

	public UsedProduct(Date manufactureDate) {
		super();
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	

}
