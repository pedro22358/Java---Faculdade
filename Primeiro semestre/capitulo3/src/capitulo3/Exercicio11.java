package capitulo3;
import java.util.Scanner;
import java.lang.Math;
public class Exercicio11 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.print("Insira um numero positivo, maior que zero e inteiro:");
		double n, n2, n3, r2, r3;
		n = ent.nextDouble();
		n2 = Math.pow(n,2);
		n3 = Math.pow(n,3);
		r2 = Math.sqrt(n);
		r3 = Math.cbrt(n);
		
		System.out.printf("Ao quadrado: %.1f, Ao cubo: %.1f, Raiz quadrada: %.1f, Raiz cubica: %.9f", n2, n3, r2, r3);
		ent.close();

	}

}
