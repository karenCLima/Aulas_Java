
public class Jogador {
	
	//Atributos
	
	String nome;
	int gols;
	int assistencias;
	
	//Construtor
	
	public Jogador(String nome) {
		this.nome = nome;
	}
	
	//Métodos
	
	public void adicionarGol(int gols) {
		this.gols += gols;
	}
	
	public void adicionarAssistencia(int assistencias) {
		this.assistencias += assistencias;
	}
	
	public String Gols() {
		return "Número de gols de " + this.nome+ " é: "+ this.gols;
	}
	
	public String Assistencias() {
		return "Numero de assistências de " + this.nome + " é: " + this.assistencias;
	}
}
