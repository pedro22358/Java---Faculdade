package lista2;
import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int f,n,e=1,g=0;
		System.out.println("Insira quantos números: ");
		f = ent.nextInt();
		for (n=1;n<=f;n++) {
			e=e+g;
			g=e-g;
			if(g<f) {
				System.out.println(" " + g);
			}
		}
		if (f<=0){
			System.out.println("Nulo");
		}
		ent.close();
	}

}
