
class Cachorro extends Animal {
	Cachorro(String nome) {
		super(nome);		
	}
	
	private String fala = "Au Au";
	
	public void setFala(String fala) {
		this.fala = fala;
	}
	
	public String getFala() {
		return fala;
	}	
}
