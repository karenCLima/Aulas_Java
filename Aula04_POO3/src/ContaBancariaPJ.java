
//Herança
public class ContaBancariaPJ extends ContaBancaria{
	
	//Atributos
	private String empresa;
	
	//Construtor
	public ContaBancariaPJ(String titular, double saldo, String empresa) {
		super(titular, saldo);
		this.empresa = empresa;
		
	}
	
	//toString
	@Override
	public String toString() {
		return "ContaBancariaPJ [titular= "+ super.titular+ ", Saldo= "+ super.saldo + ", Empresa=" + empresa + "]";
	}
	
	// Criando Getters e Setters

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	@Override
	public void mostrarSaldo() {
		System.out.println("Olá, "+ titular+" da empresa "+ empresa);
		System.out.println("Seu saldo é: R$"+saldo);
		
	}

	

	@Override
	public double Sacar(double valorSaque) {
		if (saldo -20 >= valorSaque) {
			this.saldo -= valorSaque;
			System.out.println("Saque efetuado com sucesso!");
			return valorSaque;
		}else {
			System.out.println("Saldo indisponível!");
			return 0;
		}
	}

	
	
	
}
