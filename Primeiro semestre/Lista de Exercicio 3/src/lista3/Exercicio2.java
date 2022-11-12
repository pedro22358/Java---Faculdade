package lista3;
import java.util.Scanner;
public class Exercicio2 {
public static void menu(int st,int p) {
	Scanner ent = new Scanner(System.in);
	int r;
	r = st/p;	//Cálculo de média.
	System.out.println("A média de salário da população é: " + r);
	ent.close();
}
public static void menu2() {
}
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int s,p=0,st=0,f;
		System.out.println("Digite o salário: (Negativo para parar)");
		s = ent.nextInt();
		while (s>=0) {	//Número de pessoas indefinido, por isso usei o while.
			st = st+s;	//Cálcular o salário total.
			System.out.println("Digite o numero de filhos");
			f = ent.nextInt();
			p = p + f;	//Cálcular a quantidade total de pessoas.
			p += 2;	//Contar juntamente com o pai/mãe dos filhos.
			System.out.println("Digite o salário: (Negativo para parar)");
			s = ent.nextInt();
	}
		menu(st,p);
		ent.close();
	}

}
