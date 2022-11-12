package lista2;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int N,base;
		double E=0, f=1;
		System.out.println("Digite o valor de N:");
		N = ent.nextInt();
		for(base=1; base<= N; base++) {
			f = base*f;
			E=E+1/f;
		}
		E++;
		System.out.print("O valor total é: " + E);
		ent.close();
	}

}
