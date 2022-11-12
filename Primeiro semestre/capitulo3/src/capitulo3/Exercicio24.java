package capitulo3;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double hd, h, m;
		System.out.println("Digite as horas no seguinte formato: 4,30");
		hd = ent.nextDouble();
		m = hd % 1;
		h = hd - m;

		System.out.printf("Hora: %.0f, Minutos: %.2f", h, m);
		ent.close();

	}

}
