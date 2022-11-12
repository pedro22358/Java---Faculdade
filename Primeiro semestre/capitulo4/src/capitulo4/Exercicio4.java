package capitulo4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double n1, n2, n3;
		System.out.print("Digite 3 números");
		n1 = ent.nextDouble();
		n2 = ent.nextDouble();
		n3 = ent.nextDouble();
		if (n1 != n2 && n1 != n3 && n2 != n3) {
			if (n1 < n2 && n1 < n3) {
				if (n2 < n3) {
					System.out.printf("A ordem crescente é: %.2f, %.2f e %.2f", n1, n2, n3);
				} else {
					System.out.printf("A ordem crescente é: %.2f, %.2f e %.2f", n1, n3, n2);
				}
			} else if (n2 < n3 && n2 < n1) {
				if (n1 < n3) {
					System.out.printf("A ordem crescente é: %.2f, %.2f e %.2f", n2, n1, n3);
				} else {
					System.out.printf("A ordem crescente é: %.2f, %.2f e %.2f", n2, n3, n1);
				}
				if (n3 < n1 && n3 < n2) {
					if (n1 < n2) {
						System.out.printf("A ordem crescente é: %.2f, %.2f e %.2f", n3, n1, n2);
					} else {
						System.out.printf("A ordem crescente é: %.2f, %.2f e %.2f", n3, n2, n1);
					}
				}
			}
		} else {
			System.out.print("Dois ou mais numeros iguais");
		}
		ent.close();
	}

}
