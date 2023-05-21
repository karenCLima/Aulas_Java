import java.util.Random;

public class ContaBancaria {

	private Cliente cliente;
	private Long nrConta;
	private Integer agencia;
	private Double saldo;
	private Double limiteChequeEspecial;
	private TipoConta tipo;
	
	
	public ContaBancaria(Cliente cliente, TipoConta tipo, double limiteChequeEspecial, double saldo) {
		this.cliente = cliente;
		this.tipo = tipo;
		this.limiteChequeEspecial = limiteChequeEspecial;
		
		this.nrConta = new Random().nextLong();
		this.agencia = new Random().nextInt(10);
		
		this.saldo = saldo;
	}
	
	
	@Override //Gerando toString
	public String toString() {
		return "ContaBancaria [cliente=" + cliente + "\n nrConta=" + nrConta + "\n agencia=" + agencia + "\n saldo="
				+ saldo + "\n limiteChequeEspecial=" + limiteChequeEspecial + "\n tipo=" + tipo + "]";
	}
	
	

//Getters e Setters
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Long getnrConta() {
		return this.nrConta;
	}
	
	public void setnrConta(Long nrConta) {
		this.nrConta = nrConta;
	}

	public Long getNrConta() {
		return nrConta;
	}

	public void setNrConta(Long nrConta) {
		this.nrConta = nrConta;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}

	public void setLimiteChequeEspecial(Double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	
	
}

