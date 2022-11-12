package src;

class Lista{
	public Celula prim;
	public Celula ult;
	Lista(){
		prim = new Celula();
		ult = prim;
	}
	int tam = 0;
	void queue(int elemento) {
		ult.prox = new Celula(elemento);
		ult = ult.prox;
		tam++;
	}
	
	int dequeue() {
		Celula tmp =  prim.prox;
		int retorno = prim.prox.elemento;
		prim.prox = prim.prox.prox;
		tmp.prox = null;
		tmp = null;
		if(prim.prox == null) {
			ult = prim;
		}
		tam--;
		return retorno;
	}
	
	int getTam() {
		return tam;
	}
	
	void mostrar() {
		Celula aux = prim.prox;
		while(aux != null) {
			System.out.print(aux.elemento + " ");
			aux = aux.prox;
		}
	}
	
	boolean isEmpty() {
		if(prim.prox == null) {
			return true;
		}
		return false;
	}
}
