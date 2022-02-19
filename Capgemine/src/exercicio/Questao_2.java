package exercicio;

import java.util.Scanner;

public class Questao_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// variaveis do tipo inteiro
		int countMaiusculo = 0;
		int countMinusculo = 0;
		int countDigito = 0;
		int countCaractereEspecial = 0;

		
		/** Essa parte do codigo pede para informa a senha com todos
		 *   Os criterios, e se a senha nao tiver 6 digito retorna 
		 *   Uma mensagem para o usuario que a senha nao � segura por que nao contem 6 digitos **/
		
		System.out.print("Pro favor, insira a sua senha: ");
		Scanner sc = new Scanner(System.in);
		String senha = sc.next();

		if (senha.length() < 6) {
			int digitosRestantes = 6 - senha.length();
			System.out.printf("Sua senha ainda n�o � segura. ela possui menos de 6 d�gitos: ", digitosRestantes);
			
		}
		
		// Aqui faz a verificacao se a senha contem letra MAIUSCULA e MINUSCULA
		for (int i = 0; i < senha.length(); i++) {
			char c = senha.charAt(i);
			if (Character.isUpperCase(c)) {
				countMaiusculo +=1;
			} else if (Character.isLowerCase(c)) {
				countMinusculo += 1;
			} else if (Character.isDigit(c)) {
				countDigito += 1;
			}

			
			/**
			 * Essa Parte do codigo verifica se a senha que foi digitada contem algum dos
			 * caracter
			 **/
			else if (senha.contains("!") || senha.contains("@") || senha.contains("#") || senha.contains("$")
					|| senha.contains("%") || senha.contains("^") || senha.contains("&") || senha.contains("*")
					|| senha.contains("(") || senha.contains(")") || senha.contains("-") || senha.contains("+")) {
				countCaractereEspecial += 1;
			}

		}

		/**
		 * Aqui faz a verifica�ao da senha se ela nao possui nenhum dos seguintes
		 * crit�rios
		 **/

		if (countMaiusculo == 0) {
			System.out.println("A senha  n�o possui letra mai�scula");
		} else if (countMinusculo == 0) {
			System.out.println("A senha  n�o possui letra mi�scula");
		} else if (countDigito == 0) {
			System.out.println("A senha  n�o possui d�gito");
		} else if (countCaractereEspecial == 0) {
			System.out.println("A senha  n�o possui caractere especial");
		}

		/**
		 * Esse else verifica a senha e se a senha possui todos os criterios ele retona
		 * Uma mensagen SUA SENHA ESTA SEGURA!
		 **/
		else {
			System.out.println("Sua senha est� segura!");
		}

		sc.close();
	}

}
