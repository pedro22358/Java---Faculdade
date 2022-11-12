package lista3;

import java.util.Scanner;

public class Exercicio6 {
	public static double Fatorial(double N) {
		double E=0, f=1;
		for(int base=1; base<= N; base++) {	//calculo de fatorial
			f = base*f;
			E=E+1/f;
	}
		return(E);	//retornar o valor final
}
	public static void main(String[] args) {
		double N;
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite o fatorial:");
		N = ent.nextDouble();
		System.out.println("O resultado é:" + Fatorial(N));	//print chamando a função e tendo o retorno do valor final
		ent.close();
	}

}
