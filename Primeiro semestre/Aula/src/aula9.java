import java.util.Scanner;

public class aula9 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int conta, soma = 0, N, num;
		System.out.println("Digite o limite:");
		N = ent.nextInt();
		for (conta = 1; conta <= N; conta++) {
			System.out.println("Digite um valor:");
			num = ent.nextInt();
			soma += num;
		}
		System.out.printf("A soma digita é: %d \n", soma);
		soma = 0;
		for (conta = 1; conta <= N; conta++) {
			soma += conta;
		}
		System.out.printf("A soma da contagem é: %d", soma);
		ent.close();
	}
}
