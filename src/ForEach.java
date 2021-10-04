
public class ForEach {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Samuel", "Ingrid", "Vão casar"};
		
		/*
		 * Esse for each pega posição por posição do vetor e armazena em  words
		 * a cada iteração, até o final
		 */
		for(String words : vect) {
			System.out.println(words);
		}
	}

}
