package capitulo3;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double pq, pg;
		System.out.println("Insira o peso em quilos:");
		pq = ent.nextDouble();
		pg = pq*1000;
		System.out.printf("O peso em gramas e: %.2f", pg);
		ent.close();
		

	}

}
