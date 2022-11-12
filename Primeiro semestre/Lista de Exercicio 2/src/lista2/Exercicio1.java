package lista2;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int a,M1,m1,z;
		char escolha;
		a = 0;
		escolha = 0;
		M1 = 0;
		m1 = 0;
		z = 0;
		while (escolha != 'p') {
			System.out.println("Digite um número inteiro: ");
			a = ent.nextInt();
			if (a > 0) {
				M1 ++;
			}
			else if (a < 0) {
				m1 ++;
			}
			else {
				z++;
			}
			System.out.println("Digite p para parar:");
			escolha = ent.next().charAt(0);
		}
		System.out.printf("O quantidade de números positivos é: %d \nA quantidade de números negativos é: %d \nA quantidade de zeros é: %d", M1,m1,z);
		ent.close();
	}

}
