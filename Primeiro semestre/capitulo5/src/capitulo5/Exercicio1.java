package capitulo5;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double sa, sp, a, p;
		sp = 1000;
		p = 1.5/100;
		sa = sp + (sp*p);
		a = 2007;
		while (a <=2022) {
			p*=2;
			sa=sa + p*sa;
			a++;
		}
		System.out.printf("O valor atual do salario é: %.2f", sa);
		ent.close();
	}

}
