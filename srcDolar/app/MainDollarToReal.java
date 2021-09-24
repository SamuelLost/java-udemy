package app;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class MainDollarToReal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Qual é o preço do dólar? ");
		double dollarPrice = sc.nextDouble();
		System.out.printf("Quantos dólares serão comprados? ");
		double amount = sc.nextDouble();
		
		double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
		System.out.printf("Valor a ser pago em reais: %.2f", result);
	
		sc.close();
	}

}
