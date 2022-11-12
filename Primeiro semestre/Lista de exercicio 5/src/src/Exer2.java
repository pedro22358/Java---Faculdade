package src;

import java.util.Scanner;

public class Exer2 {
	public static void preenc(int[] vet) { // procedimento para preencher o vetor
		Scanner ent = new Scanner(System.in);
		for (int pos = 0; pos < 10; pos++) { // percorrer todas as posições do vetor
			System.out.println("Digite um número:");
			vet[pos] = ent.nextInt();
		}
	}

	public static int[] negat(int[] vet, int[] neg) {
		int posi = 0;
		for (int pos = 0; pos < 10; pos++) {
			if (vet[pos] < 0) {
				neg[posi] = vet[pos];	//copiar os números negativos do vetor vet para o vetor neg
				posi++;	//variavel separada para percorrer as posições do valor neg
			}
		}
		return neg;
	}

	public static void main(String[] args) {
		int[] vet = new int[10];
		int n=0;
		preenc(vet);	//chamar o procedimento para preencher um vetor
		for (int pos = 0; pos < 10; pos++) {
			if (vet[pos] < 0) {
				n++; // contar quantos números negativos
			}
		}
		int[] neg = new int[n];	// vetor com tamanho da quantidade de números negativos para copiar de outro
		negat(vet,neg);
		for(int pos=0;pos<neg.length;pos++) {	//percorrer todas as posições do vetor e printar os números de cada posição
			System.out.printf("[%d]%d ",pos,neg[pos]);
		}

	}

}
