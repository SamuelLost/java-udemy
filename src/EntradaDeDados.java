//import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		//Locale.setDefault(Locale.US);
		/* Deixe a linha 7 comentada caso queira digitar ponto flutuante
		 * com vírgula, caso contrário descomente e digitir com ponto.
		 */
		Scanner sc = new Scanner(System.in);
		String nome;
		nome = sc.next();
		
		int x;
		x = sc.nextInt();
		System.out.println(nome + " tem " + x + " anos!");
		
		double peso;
		peso = sc.nextDouble();
		System.out.println("E pesa "+peso);
		
		/*Lendo um caractere*/
		char a;
		a = sc.next().charAt(0);
		System.out.println(a);
		sc.close();
	}

}