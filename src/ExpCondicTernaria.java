
public class ExpCondicTernaria {

	public static void main(String[] args) {
		// Expressão condicional ternária
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		System.out.println(desconto);
	}

}
