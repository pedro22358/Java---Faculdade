package capitulo3;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double s, vv, c, sf;
		System.out.println("Insira o valor do salario:");
		s = ent.nextDouble();
		System.out.println("Insira o valor das vendas:");
		vv = ent.nextDouble();
		c = vv * 4/100;
		sf = s + c;
		System.out.printf("O valor final do salario e: %.2f", sf);
		ent.close();
		
	}

}
