package lista3;

import java.util.Scanner;

public class Exercicio7 {
	public static boolean posneg(int num) {
		return (num >= 0);	//retornar condição de verdadeiro ou falso
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int n, num;
		System.out.println("Digite a quantidade de números:");
		n = ent.nextInt();
		for (int i = 1; i <= n; i++) {	//For para limite já definido pela pessoa
			System.out.println("Digite o número:");
			num = ent.nextInt();
			if (posneg(num) == true) {	//Chamar a função e ter um retorno true or false
				System.out.println("O número é positivo");
			} else {
				System.out.println("O número é negativo");
			}
		}
		ent.close();
	}

}
