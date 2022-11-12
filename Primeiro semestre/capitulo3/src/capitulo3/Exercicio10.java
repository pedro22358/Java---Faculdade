package capitulo3;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Insira o valor do raio:");
		double r, pi, re;
		r =  ent.nextDouble();
		pi = 3.14;
		re = pi * (Math.pow(r, 2));
		
		System.out.printf("O valor da area de um circulo e: %.2f", re);
		ent.close();

	}

}
