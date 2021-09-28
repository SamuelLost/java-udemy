import java.util.Locale;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vetAltura = new double[n]; //Declaração de um vetor
		double soma = 0.0;
		for(int i = 0; i < n; i++) {
			vetAltura[i] = sc.nextDouble();
			soma += vetAltura[i];
		}
		double media = soma/n;
		
		System.out.printf("Média das alturas: %.2f", media);
		sc.close();
		
	}

}
