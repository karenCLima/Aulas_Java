
public class Contador extends Pagamento {
	
	private final double bonificacao = 1.03;

	public Contador(String nome, double valorHora, double totalHoras) {
		super(nome, valorHora, totalHoras);
		
	}

	@Override
	public double valorReceber() {
		double salario = super.valorHora*super.totalHoras*bonificacao; 
		return salario;
	}

}
