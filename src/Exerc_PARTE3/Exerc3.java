package Exerc_PARTE3;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int alcool = 0;
		int diesel = 0;
		int gasolina = 0;
		
		int cod = sc.nextInt();
		
		while(cod != 4) {
			if(cod == 1) {
				alcool++;
			}
			else if(cod ==2) {
				gasolina++;
			}
			else if(cod == 3) {
				diesel++;
			}
			
			cod = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}

}
