package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	
	
	// Attributes
	private Date manufactureDate;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	// Constructors
	public UsedProduct() {
	}
	
	public UsedProduct(String name, double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	// Getters & Setters
	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	public Date getManufactureDate() {
		return manufactureDate;
	}
	
	// Methods
	
	@Override
	public String priceTag() {
		return "Nome: " +
				getName() + " (usado) \n" +
				"Preço: R$ " + String.format("%.2f", getPrice()) + "\n" +
				"Data da Manufatura: " + sdf.format(manufactureDate) + "\n"; 
	}
}
