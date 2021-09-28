package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Product3;

public class Stock3 {

	public static void main(String[] args) {
		/* Versão 3: utilizando encapsulamento (private), 
		 * getters e setters
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.printf("Name: ");
		String name = sc.nextLine();
		
		System.out.printf("Price: ");
		double price = sc.nextDouble();
		
		System.out.printf("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		// Obrigando a informar os dados do produto no momento da instanciação
		Product3 product = new Product3(name, price, quantity);
		
		product.setName("Computer");
		System.out.println("Updated name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Updated price: " + product.getPrice());
		
		
		System.out.println("\nProduct data: " + product.toString() + "\n");
		
		System.out.print("Enter the number of products to be added in stock: ");
		int qntd = sc.nextInt();
		product.addProducts(qntd);
		
		System.out.println("\nUpdated data: " + product.toString() + "\n");
		
		System.out.print("Enter the number of products to be removed from stock: ");
		qntd = sc.nextInt();
		product.removeProducts(qntd);
		System.out.println("\nUpdated data: " + product.toString() + "\n");


		sc.close();
	}

}
