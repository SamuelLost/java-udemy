package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Product2;

public class Stock2 {

	public static void main(String[] args) {
		/* Versão 2: utilizando contrutor
		 * Programa que faz a gerência de um estoque
		 * remove e adiciona produtos
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
		Product2 product = new Product2(name, price, quantity);
		
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
