package capitulo3;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double n1, n2, r;
		System.out.println("Insira dois numeros:");
		n1 = ent.nextDouble();
		n2 = ent.nextDouble();
		r = n1-n2;
		
		System.out.printf("O resultado e: %.2f", r);
		ent.close();

	}

}
