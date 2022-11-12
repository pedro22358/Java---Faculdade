package capitulo3;
import java.util.Scanner;
public class Exercicio18 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int R, g1, g2, qg, qf;
		System.out.println("Digite a quantidade de quilos comprados:");
		R =  ent.nextInt();
		System.out.println("Digite a quantidade de comida do gato 1:");
		g1 = ent.nextInt();
		System.out.println("Digite a quantidade de comida do gato 2");
		g2 = ent.nextInt();
		
		qg = R*1000;
		qf = qg - ((g1*5) + (g2*5));
		
		System.out.printf("Quantidade de ração restante: %d", qf);
		ent.close();

	}

}
