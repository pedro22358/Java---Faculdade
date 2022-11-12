package capitulo4;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double n1,n2;
		System.out.print("Digite dois numeros:");
		n1 = ent.nextDouble();
		n2 = ent.nextDouble();
		if (n1>n2) {
			System.out.print("Numero um é maior.");
		}
		else if (n2>n1) {
			System.out.print("Numero dois é maior.");
		}
		else {
			System.out.print("Os numeros são iguais");
		}
		ent.close();
	}

}
