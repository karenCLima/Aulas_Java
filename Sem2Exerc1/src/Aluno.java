
public class Aluno {
	
	private String nome;
	private Long matricula;
	
	private Double [] notas = new Double[3];
	
	public Aluno(String nome, Long matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public void AdicionarNota(double nota) {
		
		double soma =0;
		
		for(int i=0;i<notas.length; i++ ) {
			if(soma + nota >100) {
				System.out.println("Somatório maior que 100. Não foi possível adicionar!");
				break;
			}
			if(notas[i]==null) {
				notas[i] = nota;
				break;
			}else {
				soma+=notas[i];
			}
		}
		
	}
	
	public void verNotas() {
		for(int i = 0; i< notas.length; i++) {
			System.out.println(notas[i]);
		}
	}
	

}
