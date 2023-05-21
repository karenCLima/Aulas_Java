
public abstract class Pagamento {
	
	protected String nome;
	protected double  valorHora;
	protected double totalHoras;
	
	
	
	public Pagamento(String nome, double valorHora, double totalHoras) {
		this.nome = nome;
		this.valorHora = valorHora;
		this.totalHoras = totalHoras;
	}



	public abstract double valorReceber();
	

}
