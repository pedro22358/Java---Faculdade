import java.util.Scanner;
public class aulamatriz {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int [] vetor = new int [10];
		int N,maior,posMaior,temp;
		//preenchimento
		System.out.println("Digite o total de elementos: (máx 10)");
		N = ent.nextInt();
		for(int i = 0; i<N;i++) {
			System.out.print("Valor:");
			vetor[i] = ent.nextInt();
		}
		//maior e posição
		maior = vetor[0];
		posMaior = 0;
		for(int pos = 1; pos<N; pos++) {
			if(vetor[pos] > maior) {
				maior = vetor [pos];
				posMaior = pos;
			}
		}
		System.out.println("O maior é " + maior + "e está em" + posMaior);
		//ordem decrescente
		for(int atual = 0; atual <N-1;atual++) {
			maior = vetor[atual];
			posMaior = atual;
			for (int prox = atual+1; prox<N;prox++) {
				if(vetor[prox]>maior) {
					maior = vetor[prox];
					posMaior = prox;
				}
			}
			temp = vetor[atual];
			vetor[atual] = vetor [posMaior];
			vetor[posMaior] = temp;
			
			for (int p = 0; p<N;p++) {
				System.out.print(vetor[p] + " ");
			}
			System.out.println();
			ent.close();
		}
	}

}
