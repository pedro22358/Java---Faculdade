package src;
import java.util.Random;

public class Exercicio {
	
	public static void swap(double [] vet, int i, int j) {
		double auxiliar;
		auxiliar = vet[i];
		vet[i] = vet[j];
		vet[j] = auxiliar;
	}

	public static void main(String[] args) {
		long tempoInicial = System.currentTimeMillis();
		double vet[] = new double [40000];
		preench(vet);
		long tempoFinal = System.currentTimeMillis();
		System.out.printf("%.10f \n",vet[0]);
		System.out.printf("%.10f \n",vet[1]);
		quicksort(vet,0,vet.length-1);
		System.out.printf("O tempo gasto para preencher o vetor é de %.3f segundos \n",(tempoFinal - tempoInicial)/1000d );
		System.out.printf("%.10f \n",vet[0]);
		System.out.printf("%.10f \n",vet[0]);
	}
	

	public static double[] preench(double vet[]) {
		Random ran = new Random();
		for(int i=0;i<40000;i++) {
			vet[i] = ran.nextDouble();
		}
		return vet;
	}

	public static void quicksort(double [] vet, int esquerda, int direita) {
		int i = esquerda, j = direita;
		double pivo = vet[(esquerda+direita)/2];
		while(i <= j) {
			while(vet[i]<pivo) {
				i++;
			}
			while(vet[j]>pivo) {
				j--;
			}
			if(i <= j) {
				swap(vet, i, j);
				i++;
				j--;
			}
		}
		if(esquerda < j) {
			quicksort(vet,esquerda,j);
		}
		if(i < esquerda) {
			quicksort(vet,i,direita);
		}
	}


}
