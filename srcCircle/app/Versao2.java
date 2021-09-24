package app;

import java.util.Locale;
import java.util.Scanner;

import util.CalculatorVersao2;

public class Versao2 {
	
	/*
	 * Versão 2: classe Calculator com membros de instância
	 */
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Enter radius: ");
		double radius = sc.nextDouble();
		
		// É preciso instanciar pois não tem "static" na classe
		CalculatorVersao2 cal = new CalculatorVersao2();
		
		double circ = cal.circumference(radius);
		double vol = cal.volume(radius);

		System.out.printf("Circunferência: %.2f\n", circ);
		System.out.printf("Volume: %.2f\n", vol);
		System.out.printf("Valor do PI: %.2f", cal.PI);

		sc.close();
	}
}
