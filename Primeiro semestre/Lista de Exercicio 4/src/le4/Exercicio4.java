package le4;

import java.util.Scanner;

public class Exercicio4 {

	public static int divisao(int num, int div) {
		if (num >= div) {	//recursividade
			return divisao(num-div, div);	//chamar a recursividade para mostrar o resto
		}
		else if(num == div) {
			return 0;	//se num==div o resto da divisão é sempre zero
		}
		else {
			return num;	//caso o num seja menor que div, ele mesmo será o resto, retornando ele
		}
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int x, y;
		System.out.println("Digite x e y:");
		x = ent.nextInt();
		y = ent.nextInt();
		System.out.println("A divisão é: " + divisao(x, y));	//chamar a função
		ent.close();
	}

}
