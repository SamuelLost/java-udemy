package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;


public class App {

	public static void main(String[] args) {
		/*
		 * Programa que faz a gerência de um estoque
		 * remove e adiciona produtos
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data:");
		System.out.printf("Name: ");
		product.name = sc.nextLine();
		System.out.printf("Price: ");
		product.price = sc.nextDouble();
		System.out.printf("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
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
