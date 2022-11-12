package lista3;
import java.util.Scanner;
public class Exercicio1 {
public static void menu(double a, double b, double c, char o, double r) {
	switch(o){ //Decidi usar o switch pela questão da simplicidade em mexer com caractere.
	case 'A': r = (a+b+c)/3;
	System.out.println("A média aritmética é: " + r);
	break;
	case 'a': r = (a+b+c)/3;
	System.out.println("A média aritmética é: " + r); //Repeti o mesmo case para caso a pessoa digite "a" ao ínves de "A".
	break;
	case 'P': r = ((5*a)+(3*b)+(2*c))/(5+3+2);
	System.out.println("A média ponderada é: " + r);
	break;
	case 'p':r = ((5*a)+(3*b)+(2*c))/(5+3+2);
	System.out.println("A média ponderada é: " + r);	//Repeti o mesmo case para caso a pessoa digite "p" ao ínves de "P".
	break;
	default: System.out.print("Opcação inválida.");
	}
}
	public static void main(String[] args) {
		double a,b,c,N,r=0;
		char o;
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite a quantidade de alunos:");
		N = ent.nextDouble();
		for (int i=1; i<=N; i++) {	//Como o número de alunos era definido, decidi usar for pela simplicidade.
		System.out.println("Digite as três notas:");
		a = ent.nextInt();
		b = ent.nextInt();
		c = ent.nextInt();
		System.out.println("Digite A para Media aritimética ou P para Media ponderada:");
		o = ent.next().charAt(0);
		menu(a,b,c,o,r);
		}
		ent.close();
	}

}
