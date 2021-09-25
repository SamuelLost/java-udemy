package entities;

public class Product2 {
	
	public String name;
	public double price;
	public int quantity;
	
	//Versão 2: utilizando construtor
	public Product2(String name, double price, int quantity) {
		//this referencia o objeto, ou seja, o name da linha 5
		this.name = name;
		this.price = price;
		this.quantity = quantity;
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
