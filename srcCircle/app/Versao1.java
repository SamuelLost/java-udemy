package app;

import java.util.Locale;
import java.util.Scanner;

public class Versao1 {
	
	/*
	 * Versão 1: métodos na própria classe do programa
	 * "static" só funciona dentro da main
	 */
	
	
	// Para ser constante, deve ter a palavra "final"
	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter radius: ");
		double radius = sc.nextDouble();
		
		double circ = circumference(radius);
		double vol = volume(radius);
		
		System.out.printf("Circunferência: %.2f\n", circ);
		System.out.printf("Volume: %.2f\n", vol);
		System.out.printf("Valor do PI: %.2f", PI);
		
		sc.close();
	}
	
	public static double circumference(double radius) {
		return (2.0 * PI * radius);
	}
	
	public static double volume(double radius) {
		return (4.0 * PI * Math.pow(radius, 3)) / 3.0;
	}
}
