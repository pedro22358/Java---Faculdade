package src;

class Lista{
	private int vetor[];
	private int tamanho;
	
	Lista(){
		this(6);
	}
	Lista(int x){
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
	
	void inserirFinal(int x) {
		if(tamanho == vetor.length) {
			System.out.println("Vetor cheio");
		}else {
		vetor[tamanho] = x;
		tamanho++;
		}
	}
	
	void inserirPos(int x, int pos) {
		if(tamanho == vetor.length) {
			System.out.println("Vetor cheio");
		}if(pos > vetor.length || pos < 0) {
			System.out.println("Posição inválida");
		}else {
			for(int i=tamanho;i>pos;i--) {
			vetor[i] = vetor[i-1];
			}
			vetor[pos] = x;
		}
	}
	
	int removerInicio() {
		int retorno=0;
		if(tamanho == 0) {
			System.out.println("Lista vazia");
		}else {
			retorno = vetor[0];
			for(int i=0;i<tamanho-1;i++) {
				vetor[i] = vetor[i+1];
			}
			tamanho--;
		}
		return retorno;
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
	
	int removerPos(int pos) {
		int retorno=0;
		if(tamanho == 0) {
			System.out.println("Lista vazia");
		}if(pos<0 || pos>vetor.length) {
			System.out.println("Posição inválida");
		}
		else {
			retorno = vetor[pos];
			for(int i=pos;i<tamanho;i++) {
				vetor[i] = vetor[i+1];
				}
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
		}
	}
}
