
public class Principal {

	public static void main(String[] args) {
		
		//Exercício 3- Calculadora
//		System.out.println(Calculadora.Soma(10, 5));
//		System.out.println(Calculadora.Subtracao(10, 5));
//		System.out.println(Calculadora.Multiplicacao(10, 5));
//		System.out.println(Calculadora.Divisao(10, 5));
		
		//Exercício 1- matricula
//		Aluno aluno1 = new Aluno("Fulano", 3629841526582L);
//		Aluno aluno2 = new Aluno("Beltrano", 7629841526582L);
//		
//		aluno1.AdicionarNota(10);
//		aluno1.AdicionarNota(50);
//		aluno1.AdicionarNota(40);
//		
//		aluno1.verNotas();
//		System.out.println("--------------------------------------");
//		
//		aluno2.AdicionarNota(10);
//		aluno2.AdicionarNota(50);
//		aluno2.AdicionarNota(50);
//		
//		aluno2.verNotas();
		
		//Exercício 2 - Pedido
		Pedido pedido1 = new Pedido();
		pedido1.AdicionandoItens("Hamburguer", 25);
		pedido1.AdicionandoItens("Refrigerante", 10);
		pedido1.AdicionandoItens("Sorvete", 12);
		pedido1.AlterarStatus(Status.FINALIZADO);
		
		System.out.println(pedido1);
		
		
		

	}

}
