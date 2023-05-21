
public class ContaBancariaPF extends ContaBancaria {

	public ContaBancariaPF(String titular, double saldo) {
		super(titular, saldo);
		
	}

	@Override
	public void mostrarSaldo() {
		System.out.println("Olá, "+ titular);
		System.out.println("Seu saldo é: R$"+saldo);
		
	}

	@Override
	public double Sacar(double valorSaque) {
		if (saldo -10 >= valorSaque) {
			this.saldo -= valorSaque;
			System.out.println("Saque efetuado com sucesso!");
			return valorSaque;
		}else {
			System.out.println("Saldo indisponível!");
			return 0;
		}
	}

}
