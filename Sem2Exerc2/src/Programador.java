
public class Programador extends Pagamento {
	
	private final double bonificacao = 1.05;
	
	public Programador(String nome, double valorHora, double totalHoras) {
		super(nome, valorHora, totalHoras);
		
	}

	@Override
	public double valorReceber() {
		double salario = super.valorHora*super.totalHoras*bonificacao; 
		return salario;
		
		
	}

}
