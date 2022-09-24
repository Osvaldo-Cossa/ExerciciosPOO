package ficha03;

public abstract class ContaBancaria {
	private double numeroConta;
	private double saldo;
	
	public abstract double sacar(double saque);
	public abstract double depositar(double deposito);
	
}
