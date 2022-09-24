package ficha03;

public abstract class ContaBancaria {
	double numeroConta;
	double saldo;
	
	public abstract double sacar(double saque);
	public abstract double depositar(double deposito);
	
}
