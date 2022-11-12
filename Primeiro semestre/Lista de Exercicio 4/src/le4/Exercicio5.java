package le4;

import java.util.Scanner;

public class Exercicio5 {
	public static double fat(double n) {
		if(n==0||n==1) {	//condição de parada do fatorial
			return(1);
		}
		else return(n*fat(n-1));	//recursividade para calcular o fatorial apenas
	}
	public static double res(double n) {
		double S = 0;
		for (double par = 1; par <=n;par++) {	//repetição para calcular o exercicio pedido
			S = S + (1/(fat(par)));	//calculo do exercicio + recursividade para o calculo do fatorial
		}
		return(S);	//retornar o resultado final para o main
		}
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int n;
		System.out.println("Defina um valor para n:");
		n = ent.nextInt();
		System.out.printf("O resultado é: %.1=f", res(n));	//chamar a função
		ent.close();
	}

}
