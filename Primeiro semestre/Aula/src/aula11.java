import java.util.Scanner;
public class aula11 {

	public static void main(String[] args) {
	int n;
	char sinal;
	Scanner ent = new Scanner(System.in);
	System.out.println("Digite um numero:");
	n = ent.nextInt();
	System.out.println("Digite um sinal, + - * / %:");
	sinal = ent.next().charAt(0);
	for (int x = 1; x<=10; x++) {
		switch(sinal) {
		case '+':
			System.out.printf("%d + %d = %d", n,x, n+x);
			break;
		case '-':
			System.out.printf("%d - %d = %d", n,x, n-x);
			break;
		case '*':
			System.out.printf("%d * %d = %d", n,x,n*x);
			break;
		case '/':
			System.out.printf("%d / %d = %d", n,x,(double)n/x);
			break;
		case '%':
			System.out.printf("%d % %d = %d", n,x,(double)n%x);
			break;
		}
		ent.close();
	}
	

	}

}
