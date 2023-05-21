
public class Aluno {
	
	//Atributos
	
	private String nome;
	private Double nota01;
	private Double nota02;
	private Double nota03;
	
	//Construção
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	// Métodos
	
	public void NotasAluno(Double nota01, Double nota02, Double nota03) {
		this.nota01 = nota01;
		this.nota02 = nota02;
		this.nota03 = nota03;
	}
	
	private double Media() {
		double soma = 0;
		soma = (this.nota01+this.nota02+this.nota03);
		return soma/3;
	}
	
	private double Maior() {
		if (this.nota01>= this.nota02 && this.nota01>=this.nota03) {
			return  this.nota01;
		}else if (this.nota02>= this.nota01 && this.nota02>=this.nota03) {
			return  this.nota02;
		}else {
			return  this.nota03;
		}
	}
		
	private double Menor() {
		if (this.nota01<= this.nota02 && this.nota01<=this.nota03) {
			return this.nota01;
		}else if (this.nota02<= this.nota01 && this.nota02<=this.nota03) {
			return this.nota02;
		}else {
			return this.nota03;
		}
	}
		
	public String InfoAluno() {
		if (NotaUltrapassa()) {
			return "Não é possível calcular a nota do Aluno(a) " + this.nome + "\n"+
					"Valor ultrapassa o esperado!";
		}
		if(FaltaNota()){
			return "Não é possível calcular a nota do Aluno(a) " + this.nome+ "\n"+
					"Está Faltando uma Nota!";
		}
		else {
			return "Aluno(a) " + this.nome + "\n"+
					"Média: "+ Media()+ "\n"+
					"Maior nota: "+ Maior()+"\n"+
					"Menor nota: " + Menor();
		}
	}
	
	private boolean NotaUltrapassa() {
		return nota01+ nota02 + nota03 > 100;
	}
	
	private boolean FaltaNota() {
		return  nota01== null || nota02 == null || nota03 == null;
	}
		
}
	

