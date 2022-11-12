package capitulo3;
import java.util.Scanner;
public class Exercicio15 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double pfv, pld, pi, ld, x, pf;
		System.out.println("Insira o valor do carro de fabrica:");
		pfv = ent.nextDouble();
		System.out.println("Insira a porcentagem do lucro do distribuidor:");
		pld = ent.nextDouble();
		System.out.println("Insira a porcentagem de imposto:");
		pi = ent.nextDouble();
		
		ld = pfv*(pld/100+1) - pfv;
		x = pfv*(pi/100);
		pf = pfv + ld + x;
		
		System.out.printf("Lucro do distribuidor: %.2f, Impostos: %.2f, Preço do carro: %.2f", ld, x, pf);
		ent.close();
		

	}

}
