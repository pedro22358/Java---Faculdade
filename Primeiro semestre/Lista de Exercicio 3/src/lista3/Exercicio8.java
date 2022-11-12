package lista3;

import java.util.Scanner;

public class Exercicio8 {
	public static double ex8(int N) {
		double S = 0;
		for (double i = 1; i <= N; i++) {	//repeti��o com limite definido
			S = S + ((i * i) + 1) / (i + 3);	//formula dada pelo exercicio
		}
		return (S);	//retorno do valor final
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int f;
		System.out.println("Digite o n�mero de repeti��es:");
		f = ent.nextInt();
		System.out.println("O resultado �: " + ex8(f));	//chamar a fun��o e ter o retorno do valor final
		ent.close();
	}

}
