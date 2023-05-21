
public class Administrador extends Pagamento {
	
	private final double bonificacao = 1.06;

	public Administrador(String nome, double valorHora, double totalHoras) {
		super(nome, valorHora, totalHoras);
		
	}

	@Override
	public double valorReceber() {
		double salario = super.valorHora*super.totalHoras*bonificacao; 
		return salario;
	}

}
