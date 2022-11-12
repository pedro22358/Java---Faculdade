package le4;

import java.util.Scanner;

public class Exercicio1 {
	
	public static int somanum(int num) {
		if (num==0) {
			return(0);	//retornar 0 caso o numerador seja zerado.
		}
		else {
			return(num%10) + somanum(num / 10);	//opera��o para retirar o �ltimo d�gito e adiciona-lo � soma.
		}
	}

	public static void main(String[] args) {
		int n;
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite um n�mero:");
		n = ent.nextInt();
		System.out.println("A soma dos digitos desse n�mero �: " + somanum(n));	//chamar a fun��o
		ent.close();
	}

}
