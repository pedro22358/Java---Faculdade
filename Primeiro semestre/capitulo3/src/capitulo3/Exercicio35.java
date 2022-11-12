package capitulo3;

import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double l,a;
		System.out.println("Insira o lado do quadrado:");
		l = ent.nextDouble();
		a = l*l;
		System.out.printf("A area do quadrado e: %.2f", a);
		ent.close();
		

	}

}
