package capitulo4;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int a,b,c,d;
		System.out.println("Digite tr�s n�meros em ordem crescente:");
		a = ent.nextInt();
		b = ent.nextInt();
		c = ent.nextInt();
		System.out.println("Digite um quarto n�mero:");
		d = ent.nextInt();
		if(d>c) {
			System.out.printf("A ordem decrescente �: %d %d %d %d", d,c,b,a);
		}
		else if(d<c && d>b) {
			System.out.printf("A ordem decrescente �: %d %d %d %d", c,d,b,a);
		}
		else if(d<b && d>a) {
			System.out.printf("A ordem decrescente �: %d %d %d %d", c,b,d,a);
		}
		else {
			System.out.printf("A ordem decrescente �: %d %d %d %d", c,b,a,d);
		}
		ent.close();

	}

}
