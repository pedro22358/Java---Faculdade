package capitulo4;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double n1,n2,n3,r;
		System.out.println("Digite suas tres notas:");
		n1 = ent.nextDouble();
		n2 = ent.nextDouble();
		n3 = ent.nextDouble();
		r = (n1+n2+n3)/3;
		if(r>=0 && r<3) {
			System.out.print("Sua nota foi: "+r+"\nVocê foi reprovado!");
		}
		else if(r>=3 && r<6) {
			System.out.print("Sua nota foi: "+r+"\nVocê repetira o exame!");
		}
		else {
			System.out.print("Sua nota foi: "+r+"\nVocê passou!");
		}
		ent.close();
	}

}
