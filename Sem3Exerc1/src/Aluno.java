
public class Aluno {
	
	//Atributos
	private String aluno;
	private String email;
	
	//Construtor
	public Aluno(String aluno, String email) {
		this.aluno = aluno;
		this.email = email;
	}
	
	//Métodos
	@Override
	public String toString() {
		return "Aluno [aluno=" + aluno + ", email=" + email + "]";
	}

	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
