package Exerc_PARTE4;

import java.util.Scanner;

public class Exerc2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int in = 0, out = 0;
		double valores;
		
		for(int i = 0; i < n; i++) {
			valores = sc.nextDouble();
			if(valores >= 10 && valores <= 20) {
				in++;
			}
			else {
				out++;
			}
		}
		
		System.out.printf("%d in\n%d out", in, out);
		
		sc.close();
	}
}
