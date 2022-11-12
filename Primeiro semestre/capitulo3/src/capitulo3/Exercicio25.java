package capitulo3;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double ca, pc, qt;
		System.out.println("Insira o custo da apresentação:");
		ca = ent.nextDouble();
		System.out.println("Insira o custo do ingresso:");
		pc = ent.nextDouble();
		qt = ca/pc;
		System.out.printf("A quantidade de ingressos para cobrir os custos e: %.0f", qt);
		ent.close();

	}

}
