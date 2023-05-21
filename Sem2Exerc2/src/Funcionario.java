
public class Funcionario {
	
	//atributos
	private String nome;
	private String funcao;
	private String cargo;
	
	//Construtor
	public Funcionario(String nome, String funcao, String cargo) {
		this.nome = nome;
		this.funcao = funcao;
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "(" + nome + "," + funcao + "," + cargo + ")";
	}
	
	
	
	
}
