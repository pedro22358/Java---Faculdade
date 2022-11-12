package capitulo3;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double n1,n2,p1,p2,r;
		System.out.println("Insira as duas notas:");
		n1 = ent.nextDouble();
		n2 = ent.nextDouble();
		p1 = 2;
		p2 = 3;
		r = ((n1*p1) +(n2*p2))/(1+2);
		
		System.out.printf("A media ponderada e: %.2f", r);
		
		ent.close();

	}

}
