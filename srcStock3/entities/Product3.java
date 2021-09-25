package entities;

public class Product3 {
	
	// Encapsulamento
	
	private String name;
	private double price;
	private int quantity;
	
	//Versão 2: utilizando construtor
	public Product3(String name, double price, int quantity) {
		//this referencia o objeto, ou seja, o name da linha 5
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	//Não foi feito o método setQuantity() para proteger o objeto produto
	//de alterações inconsistentes na quantidade dele
	public int getQuantity() {
		return quantity;
	}
	
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
