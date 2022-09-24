package ficha02;

public class Computador {
	
	private int numeroSerie;
	
	private String tipo;
	
	
	
	public Computador(int numeroSerie, String tipo) {
		super();
		this.numeroSerie = numeroSerie;
		this.tipo = tipo;
	}

	public int getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(int numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
	
	public void ligar() {
		
		System.out.println("O computador está pronto para o uso");
		
	}
	
	public void desligar() {
		
		System.out.println("O computador já pode ser desligado com segurança");
		
	}
	
	public void processar() {
		
		System.out.println("Computador processando");
	}


}
