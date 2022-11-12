package capitulo3;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		System.out.println("Digite quatro numeros:");
		Scanner ent = new Scanner(System.in);
		int a, b, c, d, e;
		a = ent.nextInt();
		b = ent.nextInt();
		c = ent.nextInt();
		d = ent.nextInt();
		e = a + b + c + d;
		
		System.out.printf("A soma dos numeros e: %d", e);
		
 ent.close();
	}

}
