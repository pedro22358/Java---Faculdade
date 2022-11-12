

class Homem extends Animal {
	Homem(String nome) {
		super(nome);		
	}
	
	private String fala = "Oi";
	
	public void setFala(String fala) {
		this.fala = fala;
	}
	
	public String getFala() {
		return fala;
	}	

}
