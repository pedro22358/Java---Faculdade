package capitulo5;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double n, f, j;
		System.out.println("insira um numero postivio e inteiro:");
		n = ent.nextDouble();
		f = 1;
		for (j=1;j<=n;j++) {
			f = f * j;
		}
		System.out.printf("O numero de fatoriais é: %.0f", f);
		ent.close();
	}

}
