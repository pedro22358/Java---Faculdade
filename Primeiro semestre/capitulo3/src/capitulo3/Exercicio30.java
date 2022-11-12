package capitulo3;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double pp,d, r, pf;
		System.out.println("Insira o preço de um produto");
		pp = ent.nextDouble();
		System.out.println("Insira o valor do disconto:");
		d = ent.nextDouble();
		r = pp * d/100;
		pf = pp-r;
		System.out.printf("O valor apos o desconto e: %.2f", pf);
		ent.close();

	}

}