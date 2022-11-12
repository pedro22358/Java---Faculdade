import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		Pilha x = new Pilha();
		System.out.println("Digite um número inteiro");
		x.empilha(ent.nextInt());
		System.out.println("Digite um número inteiro");
		x.empilha(ent.nextInt());
		System.out.println("Digite um número inteiro");
		x.empilha(ent.nextInt());
		System.out.println("Digite um número inteiro");
		x.empilha(ent.nextInt());
		x.printtam();
		x.mostrar();
		System.out.println(x.funcint(0));
		ent.close();
	}

}
