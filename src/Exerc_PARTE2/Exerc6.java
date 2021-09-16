package Exerc_PARTE2;

import java.util.Locale;
import java.util.Scanner;

public class Exerc6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double num;
		num = sc.nextDouble();
		
		if(num >= 0 && num <= 25.00) {
			System.out.println("Intervalo [0,25]");
		}
		else if(num > 25.00 && num <= 50.00) {
			System.out.println("Intervalo (25,50]");
		}
		else if(num > 50.00 && num <= 75.00) {
			System.out.println("Intervalo (50,75]");
		}
		else if(num > 75.00 && num <= 100.00) {
			System.out.println("Intervalo (75,100]");
		}
		else {
			System.out.println("Fora de intervalo");
		}
	}

}
