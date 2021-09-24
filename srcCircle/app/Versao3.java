package app;

import java.util.Locale;
import java.util.Scanner;

import util.CalculatorVersao3;

public class Versao3 {

	/*
	 * Versão 3: classe Calculator com método estático
	 */
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Enter radius: ");
		double radius = sc.nextDouble();
		
		// Não é preciso instanciar, basta utilizar o proprio nome da clase
		// Igual em Math.sqrt(double);
				
		double circ = CalculatorVersao3.circumference(radius);
		double vol = CalculatorVersao3.volume(radius);

		System.out.printf("Circunferência: %.2f\n", circ);
		System.out.printf("Volume: %.2f\n", vol);
		System.out.printf("Valor do PI: %.2f", CalculatorVersao3.PI);

		sc.close();

	}

}
