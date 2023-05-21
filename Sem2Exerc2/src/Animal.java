
public class Animal {
	
	//Atributos
	protected String nome;
	protected int idade;
	protected String tipo;
	
	//Construtor
	public Animal(String nome, int idade, String tipo) {
		this.nome = nome;
		this.idade = idade;
		this.tipo = tipo;
	}
	
	//método
	public String Exibe() {
		return "Nome=" + this.nome+ "\nIdade=" + this.idade+ "\nTipo=" + this.tipo;
	}
	
	public int MediadeVida() {
		return this.idade + 10;
	}

}
