package capitulo3;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		System.out.println("Digite tres numeros:");
		Scanner ent = new Scanner(System.in);
		double a, b, c, d;
		
		a = ent.nextDouble();
		b = ent.nextDouble();
		c = ent.nextDouble();
		d = (a+b+c)/3;

		
		System.out.printf("A soma dos numeros e: %.8f", d);
		
 ent.close();
	}

}