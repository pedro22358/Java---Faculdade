package le4;

import java.util.Scanner;

public class Exercicio2 {
	public static int divisao(int num, int den, int r) {
		if (num>=den) {	//Caso numerador seja maior ou igual ele ir� entrar no if e realizar as opera��es e calcular a quantidade de vezes que o denominador foi subtraido do numerador
			r++;	//variavel para calcular a quantidade de vezes que o denominador foi subtraido do n�merador.
			return divisao(num-den,den,r);
		}
		else {
			return r;	//retornar o resultado para o main
		}
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int numerador, denominador, r=0;
		System.out.println("Digite o n�merador e o denominador:");
		numerador = ent.nextInt();
		denominador = ent.nextInt();
		System.out.println("A divis�o �: " + divisao(numerador, denominador,r));	//Chamar a fun��o.
		ent.close();
	}

}
