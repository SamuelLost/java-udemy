package app;


import java.util.Scanner;

import entities.Quartos;

public class MainQuartos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Quartos[] quartos = new Quartos[10];
		
		System.out.println("Quantos quartos serão alugados? ");
		int qntd = sc.nextInt();
		
		for(int i = 1; i <= qntd; i++) {
			System.out.println("\nAluguel #" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			quartos[room] = new Quartos(name, email);
		}
		
		System.out.println("\nQuartos ocupados: ");
		for(int i = 0; i < 10; i++) {
			if(quartos[i] != null) {
				System.out.println(i + ": " + quartos[i]);
			}
		}
		
		sc.close();
	}

}
