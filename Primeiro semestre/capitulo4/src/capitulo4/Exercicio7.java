package capitulo4;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int i;
		double A, B, C;
		System.out.println("Digite 1,2 ou 3:");
		i = ent.nextInt();
		System.out.println("Digite três números");
		A = ent.nextDouble();
		B = ent.nextDouble();
		C = ent.nextDouble();
		switch (i) {
		case 1:
			if (A < B && A < C) {
				if (B < C) {
					System.out.printf("A ordem crescente é: %.0f %.0f %.0f", A, B, C);
					break;
				} else {
					System.out.printf("A ordem crescente é: %.0f %.0f %.0f", A, C, B);
					break;
				}
			}
			if (B < A && B < C) {
				if (A < C) {
					System.out.printf("A ordem crescente é: %.0f %.0f %.0f", B, A, C);
					break;
				} else {
					System.out.printf("A ordem crescente é: %.0f %.0f %.0f", B, C, A);
					break;
				}
			}
			if (C < A && C < B) {
				if (A < B) {
					System.out.printf("A ordem crescente é: %.0f %.0f %.0f", C, A, B);
					break;
				} else {
					System.out.printf("A ordem crescente é: %.0f %.0f %.0f", C, B, A);
					break;
				}
			}
		case 2:
			if (A > B && A > C) {
				if (B > C) {
					System.out.printf("A ordem decrescente é: %.0f %.0f %.0f", A, B, C);
					break;
				} else {
					System.out.printf("A ordem crescente é: %.0f %.0f %.0f", A, C, B);

				}
			}
			if (B > A && B > C) {
				if (A > C) {
					System.out.printf("A ordem crescente é: %.0f %.0f %.0f", B, A, C);
					break;
				} else {
					System.out.printf("A ordem crescente é: %.0f %.0f %.0f", B, C, A);

				}
			}
			if (C > A && C > B) {
				if (A > B) {
					System.out.printf("A ordem crescente é: %.0f %.0f %.0f", C, A, B);
					break;
				} else {
					System.out.printf("A ordem crescente é: %.0f %.0f %.0f", C, B, A);
					break;
				}
			}
		case 3:
			if (A > B && A > C) {
				System.out.printf("A ordem desejada é: %.0f %.0f %.0f", B, A, C);

			} else if (B > C && B > A) {
				System.out.printf("A ordem desejada é: %.0f %.0f %.0f", A, B, C);

			} else {
				System.out.printf("A ordem desejada é: %.0f %.0f %.0f", A, C, B);

			}
		}
		ent.close();
	}
}