import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		double x = 10.3865456;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.4;
		System.out.println(x);
		System.out.printf("%f\n", x);
		System.out.printf("%.4f\n", x);
		Locale.setDefault(Locale.US); //Permite trocar para vírgula e ponto
		System.out.printf("%f\n", x);
		System.out.printf("%.4f\n", x);
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}
}