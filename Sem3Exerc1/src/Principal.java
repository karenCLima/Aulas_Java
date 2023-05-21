import java.util.*;
import java.util.stream.Collectors;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {

	public static void main(String[] args) {
		
		//Exercício1
//		List <String> frutas = new ArrayList<>(Arrays.asList("Maçã", "Laranja", "Limão", "Pêra", "Abacate", "Morango","Ameixa","Manga", "Maracujá"));
//		List <String> frutasSemM = frutas.stream().filter(nome-> !nome.startsWith("M")).collect(Collectors.toList());
//		System.out.println("Frutas: " + frutas);
//		System.out.println("Frutas sem M: " + frutasSemM);
		
		//Exercício2 		
//		Map<Long, Aluno> DictAlunos = new HashMap<>();
//		
//		Scanner entrada = new Scanner(System.in);
//		
//		boolean continuar = true;
//		
//		do {
//			System.out.println("Digite 1- Para cadastrar um aluno");
//			System.out.println("Digite 2- Para retirar um aluno do cadastro");
//			System.out.println("Digite 3- Para ver os alunos cadastrados");
//			System.out.println("Digite 0- Para sair ");
//			int opcao = entrada.nextInt();
//			
//			if(opcao==1) {
//				System.out.println("Digite um número de matrícula: ");
//				Long matricula = entrada.nextLong();
//				entrada.nextLine();
//				System.out.println("Digite o nome do aluno(a): ");
//				String nome = entrada.nextLine();
//				System.out.println("Digite o e-mail do aluno(a): ");
//				String email = entrada.nextLine();
//				Aluno aluno = new Aluno(nome, email);
//				DictAlunos.put(matricula, aluno);
//			}else if (opcao ==2) {
//				System.out.println("Digite o numero da matrícula: ");
//				Long matricula = entrada.nextLong();
//				System.out.println("Você retirou o aluno(a): " + DictAlunos.get(matricula).getAluno());
//				DictAlunos.remove(matricula);
//				
//			}else if (opcao ==3) {
//				System.out.println(DictAlunos);
//			}else {
//				System.out.println("Você Saiu do sistema.");
//				continuar =false;
//			}
//			
//		}while(continuar);
		
		//Exercício3
		Map<LocalDate, Compra> ComprasMap = new HashMap<>();
		Scanner entrada = new Scanner(System.in);
		boolean continuar = true;
		
		do {
			System.out.println("Digite 1- Para inserir uma compra");
			System.out.println("Digite 2- Para ver compras em algum dia específico");
			System.out.println("Digite 0- Para sair ");
			int opcao = entrada.nextInt();
			entrada.nextLine();
			
			if(opcao==1) {
				System.out.println("Digite uma descrição: ");
				String descricao = entrada.nextLine();
				System.out.println("Digite uma data no formato dd/MM/yyyy: ");
				String data = entrada.nextLine();
				LocalDate dataCompra = LocalDate.parse(data,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				Compra compras = new Compra(descricao,dataCompra);
				ComprasMap.put(dataCompra, compras);
			}else if (opcao == 2) {
				System.out.println("Digite uma data no formato dd/mm/yyyy: ");
				String data = entrada.nextLine();
				LocalDate dataCompra = LocalDate.parse(data,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				System.out.println("As suas compras no dia " + data + " são " + ComprasMap.get(dataCompra).getDescricao());
				
			}else if (opcao ==0) {
				System.out.println("Você deixou o sistema.");
				continuar = false;
			}
			
		}while(continuar);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
