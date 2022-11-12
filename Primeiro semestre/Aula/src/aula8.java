

import java.util.Scanner;

public class aula8 {

	public static void main(String[] args) {
	Scanner ent = new Scanner(System.in);
	int conta=1, soma=0,N,num;
	float media = 0;
	System.out.println("Digite um limite:");
		N = ent.nextInt();
		while (conta<=N) {
			System.out.println("Digite um valor:");
			num = ent.nextInt();
			soma += num;
			media = (float)soma/conta;
			conta++;
		}
		System.out.printf("A soma é: %d \n", soma);
		System.out.printf("A media é: %.2f \n", media);
		soma = 0;
		conta = 1;
		while (conta<=N) {
			soma += conta;
			conta++;
		}
		System.out.print("A soma da contagem é:" + soma);
		ent.close();
	}

}
