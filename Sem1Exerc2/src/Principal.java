
public class Principal {

	public static void main(String[] args) {
		
//		Jogador jogador01 = new Jogador("Neymar");
//		jogador01.adicionarGol(200);
//		jogador01.adicionarAssistencia(57);
//		
//		System.out.println(jogador01.Gols());
//		System.out.println(jogador01.Assistencias());
//		System.out.println();
//		
//		Jogador jogador02 = new Jogador("Pelé");
//		jogador02.adicionarGol(1200);
//		jogador02.adicionarAssistencia(300);
//		
//		System.out.println(jogador02.Gols());
//		System.out.println(jogador02.Assistencias());
		
		Aluno aluno01 = new Aluno("Amanda");
		aluno01.NotasAluno(50.0, 50.0, 0.0);
		System.out.println(aluno01.InfoAluno());
		System.out.println();
		
		Aluno aluno02 = new Aluno("Clara");
		aluno02.NotasAluno(30.0, 50.0, 20.0);
		System.out.println(aluno02.InfoAluno());
		System.out.println();
		
		Aluno aluno03 = new Aluno("Vitor");
		aluno03.NotasAluno(50.0, 50.0, 50.0);
		System.out.println(aluno03.InfoAluno());
		System.out.println();
		


	}

}
