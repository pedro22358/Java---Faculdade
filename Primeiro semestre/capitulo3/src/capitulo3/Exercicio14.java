package capitulo3;
import java.util.Scanner;
public class Exercicio14 {

	public static void main(String[] args) {
	Scanner ent = new Scanner(System.in);
	int an;
	int aa;
	int A;
	System.out.println("Digíte o ano de nascimento e o ano atual");
	an=ent.nextInt();
	aa=ent.nextInt();
	
	A=aa-an;
	System.out.printf("A idade é: %d", A);
	ent.close();

	}

}
