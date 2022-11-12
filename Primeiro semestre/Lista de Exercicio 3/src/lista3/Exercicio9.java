package lista3;

import java.util.Scanner;

public class Exercicio9 {
	public static double Media(double nt, double a) {
		double r;
			r = nt/a;	//media de notas dos alunos com nota acima de 6
		return(r);	//retorno do valor final
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double a = 0, n, nt = 0;
		System.out.println("Digite a nota: (Menor que 6 para parar)");
		n = ent.nextDouble();
		while (n >= 6) {	//while para notas maiores que 6
			nt += n;	//calcular a nota total
			a++;	//calcular o total de alunos com notas maiores de 6
			System.out.println("Digite a nota: (Negativo para parar)");
			n = ent.nextDouble();
		}
		System.out.println("A média de notas dos aprovados é:" + Media(nt, a));	//chamar a função e ter o retorno do valor final
		ent.close();
	}

}
