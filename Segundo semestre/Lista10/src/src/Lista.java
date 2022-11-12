package src;

class Lista{
	public Celula prim;
	public Celula ult;
	Lista(){
		prim = new Celula();
		ult = prim;
	}
	int tam = 0;
	void InserirFinal(Celula x) {
		ult.prox = x;
		ult = ult.prox;
		tam++;
	}
	
	void InserirInicio(Celula x) {
		x.prox = prim.prox;
		prim.prox = x;
		tam++;
	}
	
	int RemoverInicio() {
		Celula tmp =  prim.prox;
		int retorno = prim.prox.idade;
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
			System.out.println(aux.nome+" "+ aux.idade);
			aux = aux.prox;
		}
	}
	
	boolean isEmpty() {
		if(prim.prox == null) {
			return true;
		}
		return false;
	}
	
	double funcint() {
		Celula aux = prim.prox;
		double media=0;
		while(aux != null) {
		media += aux.idade;
		aux = aux.prox;
		}
		return media/4;
	}
	
	double funcfunc() {
		return 0;
	}
}