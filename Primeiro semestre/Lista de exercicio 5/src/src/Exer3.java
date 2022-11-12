package src;

import java.util.Scanner;

public class Exer3 {
	public static void preenc(int [] x, int [] y) {	//procedimento para preencher dois vetores
		Scanner ent = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.println("Digite um número:");
			x[i] = ent.nextInt();
		}
		for(int j=0;j<10;j++) {
			System.out.println("Digite um número:");
			y[j] = ent.nextInt();
		}
	}
	public static void pi(int [] x,int [] y) {	//procedimento para poder intercalar dois vetores em um só
		int [] xy = new int [20];	//declaração de novo vetor com o tamanho igual a soma do tamanho do vetor x e y
		int pos=0;
		for(int i=0;i<19;i+=2) {	//percorrer posição do vetor xy
			xy [i] = x[pos];
			xy [i+1] = y[pos];
			pos++;	//percorrer posição do vetor x e y
		}
		result (xy);
	}
	public static void result(int [] res) {	//procedimento para percorrer e mostrar cada posição do novo vetor
		System.out.println("O resultado do vetor é:");
		for (int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int [] x = new int [10];
		int [] y = new int [10];
		preenc(x,y);
		pi(x,y);
		ent.close();
	}

}
