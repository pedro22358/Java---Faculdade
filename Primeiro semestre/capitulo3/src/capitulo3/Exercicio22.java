package capitulo3;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double sm, cq, q1, vp, v15, d;
		System.out.println("Insira o valor do salario minimo:");
		sm = ent.nextDouble();
		System.out.println("Insira o consumo em quilowatts:");
		cq = ent.nextDouble();

		q1 = sm * 1 / 5;
		vp = q1 * cq;
		d = vp * 15 / 100;
		v15 = vp - d;

		System.out.printf(
				"O valor de um QW e: %.2f, o valor total a ser pago e: %.2f, o valor com 15 por cento de desconto e: %.2f",
				q1, vp, v15);
		ent.close();

	}

}
