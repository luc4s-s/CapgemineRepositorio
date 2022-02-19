package exercicio;

import java.util.ArrayList;

public class Questao_3 {

	public static void main(String[] args) {

		String palavra = "ifailuhkqq";
		ArrayList<String> anagramas = new ArrayList<String>();

		for (int i = 0; i < palavra.length(); i++) {
			for (int j = 1; j < palavra.length(); j++) {
				if (palavra.charAt(i) == palavra.charAt(j) && i != j && i < j) {
					if (palavra.charAt(i) == palavra.charAt(i + 1)) {
						String x = palavra.substring(i, i + 1);
						anagramas.add(x);
					} else {
						String y = palavra.substring(i, j);
						String z = palavra.substring(i + 1, j + 1);
						String h = palavra.substring(i, i + 1);
						anagramas.add(h);
						anagramas.add(y);
						anagramas.add(z);
					}
				}
			}
		}

		System.out.println(anagramas);
	}

}
