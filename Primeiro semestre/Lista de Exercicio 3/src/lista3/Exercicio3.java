package lista3;
import java.util.Scanner;
public class Exercicio3 {
public static void menu(int a, int b, int c) {	//usei if para fazer as sequências de números
	if(a<b) {	
		if(b<c) {
			System.out.println(" " + a + " " + b + " " + c);
		}
		else
			System.out.println(" " + a + " " + c + " " + b);
	}
	else if(b<c) {
		if(a<c) {
			System.out.println(" " + b + " " + a + " " + c);
		}
		else {
			System.out.println(" " + b + " " + c + " " + a);
		}
	}
	else {
		if(a<b) {
			System.out.println(" " + c+ " " + a+ " " + b);
		}
		else {
			System.out.println(" " + c + " " + b + " " +a);
		}
	}
}
	public static void main(String[] args) {
		int N,a,b,c;
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite a quantidade de sequências:");
		N = ent.nextInt();
		for (int i = 1; i<=N; i++) {	//for para repetição com limite definido
			System.out.println("Digite três valores reais e inteiros:");
			a = ent.nextInt();
			b = ent.nextInt();
			c = ent.nextInt();
			menu(a,b,c);
		}
		ent.close();
	}

}
