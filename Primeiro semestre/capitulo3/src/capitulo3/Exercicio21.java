package capitulo3;
import java.util.Scanner;
import java.lang.Math;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double te, al, dp, p, r;
		System.out.println("Insira o tamanho da escada:");
		te = ent.nextDouble();
		System.out.println("Insira a altura do quadro:");
		al = ent.nextDouble();
		
		dp =Math.pow(al,2) - Math.pow(te, 2);
		p = dp*-1;
		r = Math.sqrt(p);
		
		System.out.printf("A distancia da escada e: %.2f", r);
		ent.close();
		
	}

}
