package Exerc_PARTE2;

import java.util.Locale;
import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codigo, qntd;
		double valor=0;
		codigo = sc.nextInt();
		qntd = sc.nextInt();
		
		if(codigo == 1) {
			valor = qntd*4;
		}
		else if(codigo == 2) {
			valor = qntd*4.5;
		}
		else if(codigo == 3) {
			valor = qntd*5;
		}
		else if(codigo == 4) {
			valor = qntd*2;
		}
		else if(codigo == 5){
			valor = qntd*1.5;
		}
		else {
			System.out.println("Opção inválida");
			System.exit(0);
		}
		
		System.out.printf("Total: R$ %.2f", valor);
		
		sc.close();
	}

}
