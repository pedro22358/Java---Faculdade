package capitulo5;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int N, j;
		float f, E = 1;
		System.out.println("Insira um valor positivo e inteiro:");
		N = ent.nextInt();
		f = 1;
		for (j=1;j<=N;j++) {
			f = f*j;
		}
		E = E + 1/f;
		System.out.printf("O resultado é: %.2f", E);
	ent.close();}
}