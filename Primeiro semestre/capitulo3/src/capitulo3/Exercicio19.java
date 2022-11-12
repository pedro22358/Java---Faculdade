package capitulo3;
import java.util.Scanner;
public class Exercicio19 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double ad, as, r;
		System.out.println("Digite a altura do degrau em metros:");
		ad = ent.nextDouble();
		System.out.println("Digite a altura que deseja subir em metros:");
		as =  ent.nextDouble();
		r = as/ad;
		
		System.out.printf("A quantidade de degraus e: %.1f", r);
		ent.close();
		

	}

}
