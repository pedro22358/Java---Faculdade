package capitulo3;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double nr, i, f, a;
		System.out.println("Insira um numero real:");
		nr = ent.nextDouble();
		f = nr % 1;
		i = nr - f;
		a = Math.round(nr);
		
		System.out.printf("O valor inteiro e: %.0f, O valor decimal e: %.9f, O valor arredondado e: %.0f",i , f, a);
		
		ent.close();

	}

}
