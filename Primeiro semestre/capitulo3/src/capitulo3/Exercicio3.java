package capitulo3;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite tres notas e seus respectivos pesos:");
		double n1, n2, n3, p1, p2, p3, r, m;
		
		n1 = ent.nextDouble();
		n2 = ent.nextDouble();
		n3 = ent.nextDouble();
		p1 = ent.nextDouble();
		p2 = ent.nextDouble();
		p3 = ent.nextDouble();
		m = p1 + p2 +p3;
		
		r = (n1 * p1 + n2 * p2 + n3 * p3)/m;
		
		System.out.printf("A media ponderada e: %.2f", r);
		
		ent.close();
		

	}

}
