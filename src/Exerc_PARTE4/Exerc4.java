package Exerc_PARTE4;

import java.util.Scanner;

public class Exerc4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b;
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			if(b == 0) {
				System.out.println("Divisão impossível");
			}
			else {
				double div = (double) a/b;
				System.out.println(div);
			}
		}
		
		sc.close();
	}
}
