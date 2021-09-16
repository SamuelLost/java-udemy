package Exerc_PARTE1;

import java.util.Locale;
import java.util.Scanner;

public class Exerc2 {
	public static void main(String[] args) {
		/*Digite um raio com ponto, tipo 2.00 e encontre
		 * a área
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//double pi = Math.PI;
		double pi2 = 3.14159;
		double raio, area;
		
		raio = sc.nextDouble();
		
		area = pi2*Math.pow(raio, 2);
		
		System.out.printf("A=%.4f", area);
		
		sc.close();
	}
}
