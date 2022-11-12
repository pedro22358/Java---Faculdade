package src;

import java.util.Scanner;

public class Exer1 {
	public static void preenc(double [] vet) {	//procedimento para preencher o vetor
		Scanner ent = new Scanner(System.in);
		for(int pos = 0; pos<10;pos++) {	//repetição para preencher o vetor com 10 notas
			System.out.println("Digite um número:");
			vet [pos] = ent.nextInt();
		}
	}
	

	public static void medias(double notas []) {
		double media = 0, c = 0;	//uma variavel para a media e outra variavel para alunos acima da media
		for (int j = 0; j<10; j++) {
			media += notas[j];	//somar todas as notas em uma variavel
		}
		media = media/10;	//dividir as notas totais pela quantidade de notas e descobrir a media
		System.out.println("A media foi: " + media);
		for (int m = 0; m<10; m++) {
			if(notas[m]>media) {
				c++;	//contar quantos alunos ficaram acima da media
				}	
		}
		System.out.println("alunos acima da média: " + c);
	}

	public static void main(String[] args) {
		double[] notas = new double[10];
		preenc(notas);	//chamar o procedimento para preencher o vetor
		medias(notas);	//chamar o procedimento para calcular media e alunos acima da media
	}

}
