package lista3;
import java.util.Scanner;
public class Exercicio2 {
public static void menu(int st,int p) {
	Scanner ent = new Scanner(System.in);
	int r;
	r = st/p;	//C�lculo de m�dia.
	System.out.println("A m�dia de sal�rio da popula��o �: " + r);
	ent.close();
}
public static void menu2() {
}
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int s,p=0,st=0,f;
		System.out.println("Digite o sal�rio: (Negativo para parar)");
		s = ent.nextInt();
		while (s>=0) {	//N�mero de pessoas indefinido, por isso usei o while.
			st = st+s;	//C�lcular o sal�rio total.
			System.out.println("Digite o numero de filhos");
			f = ent.nextInt();
			p = p + f;	//C�lcular a quantidade total de pessoas.
			p += 2;	//Contar juntamente com o pai/m�e dos filhos.
			System.out.println("Digite o sal�rio: (Negativo para parar)");
			s = ent.nextInt();
	}
		menu(st,p);
		ent.close();
	}

}
