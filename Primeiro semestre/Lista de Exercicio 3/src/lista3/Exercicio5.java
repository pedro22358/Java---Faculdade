package lista3;

import java.util.Scanner;

public class Exercicio5 {
	public static void menu(int m) {
		if (m<=39) {	//if para poder definir a nota
			System.out.println("Nota F");
		}
		else if(40<=m && m<=59) {
			System.out.println("Nota E");
		}
		else if(60<=m && m<=69) {
			System.out.println("Nota D");
		}
		else if(70<=m && m<=79) {
			System.out.println("Nota C");
		}
		else if(80<=m && m<=89) {
			System.out.println("Nota B");
		}
		else {
			System.out.println("Nota A");
		}
	}
	public static void main(String[] args) {
	Scanner ent = new Scanner(System.in);
	int N,m;
	System.out.println("Digite a quantidade de alunos:");
	N = ent.nextInt();
	for (int i=1; i<=N; i++) {	//For por causa do limite já definido pela pessoa
		System.out.println("Média do aluno:");
		m=ent.nextInt();
		menu(m);
	}
	ent.close();
	}

}
