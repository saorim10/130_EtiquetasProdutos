package entities;

public class Product {
	
	// Attributes
	private String name;
	private Double price;
	
	
	// Constructors
	public Product() {
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	
	// Getters & Setters
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Double getPrice() {
		return price;
	}
	
	
	// Methods
	public String priceTag() {
		return "Nome: " + name + "\n" +
				"Preço: R$ " + String.format("%.2f", price) + "\n";
	}
}
