public class Pilha {
	public CelulaP topo;
	public int tamanho;
	
	Pilha(){
		topo = null;
		tamanho = 0;
	}
	
	void empilha(int elemento) {
		CelulaP aux = new CelulaP(elemento);
		aux.prox = topo;
		topo = aux;
		aux = null;
		tamanho++;
	}
	
	int desempilha() {
		int retorno = topo.elemento;
		CelulaP aux = topo;
		topo = topo.prox;
		aux.prox = null;
		aux = null;
		tamanho--;
		return retorno;		
	}
	
	void mostrar() {
		CelulaP aux = topo;
		while(aux != null) {
			System.out.println(aux.elemento);
			aux = aux.prox;
		}
	}
	
	void printtam() {
		System.out.println("O tamanho da pilha é: " + tamanho);
	}
	
	void pilhavazia() {
		if(tamanho==0) {
			System.out.println("Pilha está vazia");
		}
		else {
			System.out.println("Pilha não está vazia");
		}
	}
	
	/*int funcint(int retorno) {
		if(tamanho !=0) {
			retorno += desempilha();
			funcint(retorno);
		}
		else {
			return 0;
		}
		return retorno;
	}*/

	
}
