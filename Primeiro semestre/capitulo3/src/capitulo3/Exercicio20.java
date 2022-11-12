package capitulo3;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double a, al, e, r;
		System.out.println("Digite o valor do ângulo em graus:");
		a = ent.nextDouble();
		System.out.println("Digite o valor da altura em metros:");
		al = ent.nextDouble();

		r = Math.toRadians(a);
		e = al / r;
		System.out.printf("A medida da escada e: %.2f", e);

		ent.close();

	}

}