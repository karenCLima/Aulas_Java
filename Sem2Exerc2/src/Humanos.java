
public class Humanos extends Animal {
	
	//atributos
	private String etnia;
	
	//Construtor
	public Humanos(String nome, int idade, String tipo, String etnia) {
		super(nome, idade, tipo);
		this.etnia = etnia;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Nome="+ super.nome+ "\nIdade="+super.idade +"\nTipo="+super.tipo+ "\nEtnia="+ etnia;
	}
	
	public int MediadeVida() {
		return super.idade + 50;
	}
		
	
	
	

}
