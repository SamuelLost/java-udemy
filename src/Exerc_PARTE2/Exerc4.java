package Exerc_PARTE2;

import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, duration;
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if(horaInicial < horaFinal) {
			duration = horaFinal - horaInicial;
		}
		else {
			duration = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duration +" HORA(S)");
		
		sc.close();
	}

}
