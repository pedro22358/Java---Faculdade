package capitulo3;

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double bma,bme,al,a;
		System.out.println("Insira a base maior:");
		bma = ent.nextDouble();
		System.out.println("Insira a base menor:");
		bme = ent.nextDouble();
		System.out.println("Insira a altura:");
		al = ent.nextDouble();
		a = ((bma+bme)*al)/2;
		System.out.printf("A area do trapezio e: %.2f", a);
		ent.close();

	}

}
