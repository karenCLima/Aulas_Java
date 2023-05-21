import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) {
		
		//Exercício 1
//		ArrayList <Funcionario> listFuncionario = new ArrayList<>();
//		
//		
//		listFuncionario.add(new Funcionario("Ana", "Limpar","Auxiliar de Limpeza"));
//		listFuncionario.add(new Funcionario("Beatriz", "Limpar","Auxiliar de Limpeza"));
//		listFuncionario.add(new Funcionario("Carlos", "Programar","Dev"));
//		listFuncionario.add(new Funcionario("Daniel", "Programar","Dev"));
//		listFuncionario.add(new Funcionario("Eliana", "Programar","Dev"));
//		listFuncionario.add(new Funcionario("Felipe", "Programar","Dev"));
//		listFuncionario.add(new Funcionario("Gabriela", "Contas","Contador"));
//		listFuncionario.add(new Funcionario("Helio", "Finanças","Auxiliar de finanças"));
//		listFuncionario.add(new Funcionario("Inácio", "Administrar","RH"));
//		listFuncionario.add(new Funcionario("Janaina", "Administrar","Assitente de escritório"));
//		
//		System.out.println(listFuncionario);
		
		//EXERCICIO 2
//		Animal animal1 = new Animal("Bambi",1, "Veado");
//		System.out.println(animal1.Exibe());
//		System.out.println(animal1.MediadeVida());
//		System.out.println("-----------------------------------");
//		
//		Humanos humano1 = new Humanos("Babi",14, "Humano","Europea");
//		System.out.println(humano1);
//		System.out.println(humano1.MediadeVida());
//		System.out.println("-----------------------------------");
//		
//		Animal humano2 = new Humanos("Babi",14, "Humano","Europea");
//		System.out.println(humano2.Exibe());
//		System.out.println(humano2.MediadeVida());
//		System.out.println("-----------------------------------");
//		System.out.println(humano2);
		
		//Exercicio 3
		
		Pagamento programador = new Programador("Carlos", 20, 100);
		Pagamento contador = new Contador("Maria", 12, 68);
		Pagamento adm = new Administrador("Joana", 15, 95);
		
		System.out.println(programador.valorReceber());
		System.out.println(contador.valorReceber());
		System.out.println(adm.valorReceber());
		
	}
}
