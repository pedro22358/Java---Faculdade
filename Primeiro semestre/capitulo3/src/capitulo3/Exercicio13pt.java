package capitulo3;
import java.util.Scanner;
public class Exercicio13pt {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double p, p1, j, m;
		System.out.println("Insira um valor em pes:");
		p = ent.nextDouble();
		
		p1=p*12;
		j=p*3;
		m=p*1760;
		System.out.printf("Polegada: %.2f, Jarda: %.2f, Milha: %.2f", p1, j, m);
		ent.close();
		

	}

}
