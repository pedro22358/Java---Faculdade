package le4;

import java.util.Scanner;

public class Exercicio3 {
	public static int divisao(int num, int div) {
		if (num<div) {	//condição de parada da recursividade
			return (num);	//retornar o resto
		}
		else {
			return divisao(num-div, div);	//recursividade, passar os valores de num-div e div para divisao
		}
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int numerador, denominador;
		System.out.println("Digite o númerador e o denominador:");
		numerador = ent.nextInt();
		denominador = ent.nextInt();
		System.out.println("A divisão é: " + divisao(numerador, denominador));	//chamar a função
		ent.close();
	}

}
