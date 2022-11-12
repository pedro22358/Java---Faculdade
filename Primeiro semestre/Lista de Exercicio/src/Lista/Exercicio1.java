package Lista;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int x,y,z;
		System.out.println("Digite dois números:");
		x = ent.nextInt();
		y = ent.nextInt();
		z=x+y;
		if(z>=10) {
			z= z+5;
			System.out.print("O valor de z é: " + z);
		}
		else {
			z=z+7;
			System.out.print("O valor de z é: " + z);
		}
		ent.close();
	}

}
