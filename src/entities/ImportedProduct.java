package entities;

public class ImportedProduct extends Product{
	
	// Attributes
	private Double customsFee;
	
	
	// Constructors
	public ImportedProduct() {
	}
	
	public ImportedProduct(String name, double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	
	// Getters & Setters
	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}
	public Double getCustomsFee() {
		return this.customsFee;
	}
	
	// Methods
	
	public Double totalPrice() {
		return getPrice() + customsFee;
	}
	
	@Override
	public String priceTag() {
		return "Nome: " +
				getName() + "\n" +
				"Preço: R$ " + String.format("%.2f", totalPrice()) + "\n" +
				"Taxa de Importação: R$ " + String.format("%.2f", customsFee) + "\n"; 
	}
	
}
