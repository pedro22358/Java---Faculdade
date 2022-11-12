package src;

class Fila {

	private int vetor[];
	private int tamanho;
	
	Fila(){
		this(6);
	}
	Fila(int x){
		vetor = new int [x];
		tamanho = 0;
	}
	
	void inserirInicio(int x) {
		if(tamanho == vetor.length) {
			System.out.println("Vetor cheio");
		}else {
			for(int i = tamanho; i>0;i--) {
				vetor[i] = vetor[i-1];
			}
			vetor[0] = x;
			tamanho++;
		}
	}
	
	int removerFim() {
		int retorno=0;
		if(tamanho == 0) {
			System.out.println("Lista vazia");
		}else {
			retorno = vetor[tamanho];
			tamanho--;
		}
		return retorno;
	}
	
	void mostrar() {
		if(vetor.length == tamanho) {
			System.out.println("Lista vazio");
		}else {
			for(int i=0;i<tamanho;i++) {
				System.out.print("["+vetor[i]+"] ");
			}
			System.out.println();
		}
	}
}
