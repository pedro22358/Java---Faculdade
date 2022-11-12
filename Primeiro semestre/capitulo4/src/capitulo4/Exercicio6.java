package capitulo4;
import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int a;
		System.out.print("Digite um número inteiro:");
		a = ent.nextInt();
		if(a%2 == 0) {
			System.out.printf("O número é par.");
		}
		else {
			System.out.print("O número é impar.");
		}
		ent.close();
	}

}
