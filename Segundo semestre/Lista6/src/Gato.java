class Gato extends Animal {
	Gato(String nome) {
		super(nome);		
	}
	
	private String fala = "Miau";
	
	public void setFala(String fala) {
		this.fala = fala;
	}
	
	public String getFala() {
		return fala;
	}	
}
