package capitulo3;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double n1, n2, r;
		System.out.println("Digite dois numeros diferentes de zero:");
		n1 = ent.nextDouble();
		n2 = ent.nextDouble();
		
		r = n1/n2;
		
		System.out.printf("O valor da divisão e: %.2f", r);
		ent.close();
		

	}

}
