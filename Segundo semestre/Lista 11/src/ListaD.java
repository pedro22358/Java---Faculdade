
public class ListaD {
	CelulaD prim,ult;
	int tamanho;
	
	ListaD(){
		prim = new CelulaD();
		ult = prim;
		tamanho = 0;
	}
	
	void inseririnicio(int elemento) {
		CelulaD aux = new CelulaD(elemento);
		aux.prox = prim.prox;
		aux.ant = prim;
		prim.prox = aux;
		if(prim == ult) {
			ult = ult.prox;
		}
		else {
			aux.prox.ant = aux;
		}
		tamanho++;
	}
	
	int RemoverInicio() {
		CelulaD aux =  prim.prox;
		int retorno = prim.prox.elemento;
		prim.prox = prim.prox.prox;
		aux.prox = null;
		if(aux != ult) {
			prim.prox.ant = prim;
		}
		else {
			prim = ult;
		}
		aux.ant = null;
		aux = null;
		tamanho--;
		return retorno;
	}
	
	void inserirfinal(int elemento) {
		CelulaD aux = new CelulaD(elemento);
		ult.prox = aux;
		ult = ult.prox;
		tamanho++;
	}
	
	void mostrar() {
		CelulaD aux = prim.prox;
		while(aux != null) {
			System.out.println(aux.elemento);
			aux = aux.prox;
		}
	}
}
