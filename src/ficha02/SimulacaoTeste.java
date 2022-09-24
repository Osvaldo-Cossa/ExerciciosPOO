package ficha02;

public class SimulacaoTeste {
	
	
	public String simular(String produto) {
		
		if(produto.equalsIgnoreCase("Computador")) {
			
			Computador cp = new Computador(1234, "Corporativo");
			cp.setNumeroSerie(1234);
			cp.setTipo("Corporativo");
			System.out.println("****************PRODUTO COMPUTADOR**************");
			System.out.println("Tipo de computador: "+cp.getTipo());
			System.out.println("Numero de serie de computador: "+cp.getNumeroSerie());
			cp.ligar();
			cp.desligar();
			cp.processar();
			
			
		}else if(produto.equalsIgnoreCase("Impressora")){
			
			Impressora ip = new Impressora(1112, "Pessoal");
			System.out.println("****************PRODUTO IMPRESSORA**************");
			System.out.println("Tipo de impressora: "+ip.getTipo());
			System.out.println("Numero de serie da impressora: "+ip.getNumeroSerie());
			ip.ligar();
			ip.desligar();
			ip.imprimir();
			
		}else {
			System.out.println("Este tipo de produto nao existe!");
		}
		
		return produto;
	}

	public static void main(String[] args) {
		
		
		SimulacaoTeste st = new SimulacaoTeste();
		st.simular("iMPREssora");

	}

}
