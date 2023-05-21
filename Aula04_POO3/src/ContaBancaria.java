
public abstract class ContaBancaria {
	
	//Atributos
	protected String titular;
	protected double saldo;
	
	//Construtor
	public ContaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	//toString
	@Override
	public String toString() {
		return "ContaBancaria [titular=" + titular + ", saldo=" + saldo + "]";
	}
	
	//Métodos abstratos
	public abstract void mostrarSaldo();
	public abstract double Sacar(double valorSaque);
	
}
