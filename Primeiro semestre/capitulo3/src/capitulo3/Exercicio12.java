package capitulo3;
import java.util.Scanner;
import java.lang.Math;
public class Exercicio12 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double b, e, r;
		System.out.println("Insira uma base:");
		b = ent.nextDouble();
		System.out.println("Insira um expoente:");
		e = ent.nextDouble();
		
		r = Math.pow(b, e);
		
		System.out.printf("Resultado e: %.2f", r);
		ent.close();

	}

}
