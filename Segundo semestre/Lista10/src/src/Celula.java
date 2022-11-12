package src;

class Celula{
	public Celula prox;
	public String nome;
	public int idade;
	
	
	Celula(){
		this("Desconhecido",0);
	}
	Celula(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
		prox = null;
	}
}