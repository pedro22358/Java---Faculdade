package le4;

import java.util.Scanner;

public class Exercicio2 {
	public static int divisao(int num, int den, int r) {
		if (num>=den) {	//Caso numerador seja maior ou igual ele irá entrar no if e realizar as operações e calcular a quantidade de vezes que o denominador foi subtraido do numerador
			r++;	//variavel para calcular a quantidade de vezes que o denominador foi subtraido do númerador.
			return divisao(num-den,den,r);
		}
		else {
			return r;	//retornar o resultado para o main
		}
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int numerador, denominador, r=0;
		System.out.println("Digite o númerador e o denominador:");
		numerador = ent.nextInt();
		denominador = ent.nextInt();
		System.out.println("A divisão é: " + divisao(numerador, denominador,r));	//Chamar a função.
		ent.close();
	}

}
