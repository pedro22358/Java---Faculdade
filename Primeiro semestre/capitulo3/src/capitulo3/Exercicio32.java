package capitulo3;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double p, en, em;
		System.out.println("Insira o peso");
		p = ent.nextDouble();
		en = p+(p*15/100);
		em = p-(p*20/100);
		System.out.printf("O valor engordado e: %.2f \n", en);
		System.out.printf("O valor emagreçido e: %.2f", em);
		ent.close();

	}

}
