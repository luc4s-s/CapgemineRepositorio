package exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);// Scanner para capturar dados do teclado 
		List<String> degraus = new ArrayList<>();

		 
		// Digitar a Quantidade de vez para forma o triangulo
		System.out.print("Digite a quantidade de vezes: ");
		int qtdDegraus = entrada.nextInt();

		 
		/** laço que vai de 0 até a quantidade de vez que for digitado pelo usuario
		 * E vai implementar com ESPAÇO e colocar a String (*)    **/
		for (int i = 0; i <= qtdDegraus; ++i) {
		degraus.add(" ".repeat(qtdDegraus - i) + "*".repeat(i));
		}
		 
		// laco para percorrer a lista do tipo String
		for (String d : degraus ) {
		System.out.println(d);
		}
		entrada.close();
	}
	}

