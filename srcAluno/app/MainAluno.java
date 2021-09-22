package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class MainAluno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		System.out.printf("Nome: ");
		aluno.name = sc.nextLine();
		System.out.printf("Digite as notas 1, 2 e 3: ");
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("NOTA FINAL: %.2f\n", aluno.notaFinal());
		
		if(aluno.notaFinal() < 60.0) {
			System.out.println("REPROVADO");
			System.out.printf("FALTANDO %.2f PONTOS\n", aluno.faltandoPontos());
		}
		else {
			System.out.println("APROVADO");
		}
		
		sc.close();
	}

}
