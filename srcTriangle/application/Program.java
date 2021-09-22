package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {
	/* Calcula o perímetro e area de um triangulo
	 * Usando a classe Triangle
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		System.out.print("Digite os lados (a,b,c) do triângulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.print("Digite os lados (a,b,c) do triângulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area();
		
		double areaY = y.area();
		
		System.out.printf("Área do triângulo X: %.4f\n", areaX);
		System.out.printf("Área do triângulo Y: %.4f\n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Área maior: X");
		}
		else {
			System.out.println("Área maior: Y");
		}
		sc.close();
	}

}
