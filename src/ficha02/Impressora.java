package ficha02;

public class Impressora {

	
	private int numeroSerie;
	private String tipo;
	
	public Impressora(int numeroSerie, String tipo) {
		
		this.numeroSerie = numeroSerie;
		this.tipo = tipo;
		
		
	}
	
	public void setNumeroSerie(int numeroSerie) {
		
		this.numeroSerie = numeroSerie;
	}
	
	public int getNumeroSerie() {
		
		return numeroSerie;
	}
	
	public void setTipo(String tipo) {
		
		this.tipo = tipo;
		
	}
	
	public String getTipo() {
		
		return tipo;
	}
	public void ligar() {
		
		System.out.println("A impressora está pronta para receber documentos.");
		
	}
	
	public void desligar() {
		
		System.out.println("A impressora não está mais disponível.");
		
	}
	
	public void imprimir() {
		
		System.out.println("A impressora está em uso");
	}

}
