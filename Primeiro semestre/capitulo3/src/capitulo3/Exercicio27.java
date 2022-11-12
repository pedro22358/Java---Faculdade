package capitulo3;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double n1,n2,n3,r;
		System.out.println("Insira tres numeros:");
		n1 = ent.nextDouble();
		n2 = ent.nextDouble();
		n3 = ent.nextDouble();
		r = n1*n2*n3;
		System.out.printf("A multiplicacao dos tres e: %.2f", r);
		ent.close();
		

	}

}