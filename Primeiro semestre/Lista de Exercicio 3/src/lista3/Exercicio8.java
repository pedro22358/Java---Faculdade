package lista3;

import java.util.Scanner;

public class Exercicio8 {
	public static double ex8(int N) {
		double S = 0;
		for (double i = 1; i <= N; i++) {	//repetição com limite definido
			S = S + ((i * i) + 1) / (i + 3);	//formula dada pelo exercicio
		}
		return (S);	//retorno do valor final
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int f;
		System.out.println("Digite o número de repetições:");
		f = ent.nextInt();
		System.out.println("O resultado é: " + ex8(f));	//chamar a função e ter o retorno do valor final
		ent.close();
	}

}
