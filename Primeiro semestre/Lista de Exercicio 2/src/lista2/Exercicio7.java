package lista2;
import java.util.Scanner;
public class Exercicio7 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int c1=0,c2=0,c3=0,c4=0,n=0,b=0,v=1;
		while(v>0) {
			System.out.println("Vote em um candidato:");
			System.out.println("1-c1");
			System.out.println("2-c2");
			System.out.println("3-c3");
			System.out.println("4-c4");
			System.out.println("5-nulo");
			System.out.println("6-branco");
			System.out.println("0-parar");
			System.out.println("Vote: ");
			v = ent.nextInt();
			switch (v) {
			case 1: c1++;
			break;
			case 2: c2++;
			break;
			case 3: c3++;
			break;
			case 4: c4++;
			break;
			case 5: n++;
			break;
			case 6: b++;
			break;
			default: System.out.println("Voto inválido");
			}
		}
		System.out.println("Total de votos candidato 1: " + c1);
		System.out.println("Total de votos candidato 2: " + c2);
		System.out.println("Total de votos candidato 3: " + c3);
		System.out.println("Total de votos candidato 4: " + c4);
		System.out.println("Total de votos nulo: " + n);
		System.out.println("Total de votos em brancos: " + b);
		ent.close();
	} 

}
