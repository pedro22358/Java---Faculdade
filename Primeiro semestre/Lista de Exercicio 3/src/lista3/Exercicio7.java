package lista3;

import java.util.Scanner;

public class Exercicio7 {
	public static boolean posneg(int num) {
		return (num >= 0);	//retornar condi��o de verdadeiro ou falso
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int n, num;
		System.out.println("Digite a quantidade de n�meros:");
		n = ent.nextInt();
		for (int i = 1; i <= n; i++) {	//For para limite j� definido pela pessoa
			System.out.println("Digite o n�mero:");
			num = ent.nextInt();
			if (posneg(num) == true) {	//Chamar a fun��o e ter um retorno true or false
				System.out.println("O n�mero � positivo");
			} else {
				System.out.println("O n�mero � negativo");
			}
		}
		ent.close();
	}

}
