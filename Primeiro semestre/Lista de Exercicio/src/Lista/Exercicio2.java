package Lista;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int N;
		System.out.println("Digite sua nota:");
		N = ent.nextInt();
		if (N>=8 && N<=10) {
			System.out.print("Ótimo");
		}
		else if (N>=7 && N<8) {
			System.out.print("Bom");
		}
		else if (N>=5 && N<7) {
			System.out.print("Regular");
		}
		else {
			System.out.print("Insatisfatório");
		}
		ent.close();
	}

}
