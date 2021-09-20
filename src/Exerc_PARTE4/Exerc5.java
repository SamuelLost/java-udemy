package Exerc_PARTE4;

import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fat = 1;
		
		for(int i = num-1; i >= 1; i--) {
			fat += fat*i;
		}
		System.out.println(fat);
		sc.close();
	}

}
