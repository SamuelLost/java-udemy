package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class MainBanco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;		
		System.out.printf("Seja bem-vindo(a) ao banco SH\nDigite o número da conta: ");
		int numero = sc.nextInt();
		
		System.out.printf("Digite o nome do titular: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.printf("Quer fazer um depósito inicial (y/n)?: ");
		char ch = sc.next().charAt(0);
		
		if(ch == 'y') {
			System.out.printf("Quantidade inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(nome, numero, depositoInicial);
		}
		else {
			conta = new Conta(nome, numero);
		}
		
		System.out.println("Dados da conta: " + conta.toString());
		
		System.out.printf("\nFaça um depósito: ");
		double depositoInicial = sc.nextDouble();
		conta.deposito(depositoInicial);
		
		System.out.println("Conta atualizada: " + conta);
		
		System.out.println("Realize um saque: ");
		double saque = sc.nextDouble();
		conta.saque(saque);
		
		System.out.println("Conta atualizada: " + conta);
		
		sc.close();
	}

}
