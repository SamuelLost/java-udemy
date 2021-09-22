package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
		// this é usado para referenciar ao quantity 
		// da classe
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
		// this é usado para referenciar ao quantity 
		// da classe
	}
	
	public String toString() {
		return name
			+ ", R$"
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: R$"
			+ String.format("%.2f", totalValueInStock());
	}
}
