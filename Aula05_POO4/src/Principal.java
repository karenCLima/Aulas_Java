import java.util.InputMismatchException;
import java.util.Scanner;

import exceptions.TesteException;

public class Principal {

	public static void main(String[] args) {
		
		//Interfaces
//		Forma retangulo = new Retangulo(10, 10);
//		Forma circulo = new Circulo(20);
//		
//		System.out.println(retangulo.calculaArea());
//		System.out.println(circulo.calculaArea());
		
		//Tratamento de Exceções
//		Scanner sc = new Scanner(System.in);
		
		//Caso eu coloque um boolean dará erro
//		System.out.println("Digite um número inteiro: ");
//		int entrada = sc.nextInt();
		
		//Try-Catch: tratando da exceção
//		boolean continua = true;
//		
//		while(continua) {
//			try{
//				Scanner sc = new Scanner(System.in);
//				System.out.println("Digite um número inteiro: ");
//				int entrada = sc.nextInt();
//				
//				continua = false;
//			}catch(InputMismatchException exception){
//				System.out.println("Você colocou uma opção invalida!");
//				System.out.println("Tente novamente!");
//			}
//		}
		
		//Criando Exceções
		
		//Se você extends do Exception é obrigatorio a função ficar dentro do try-catch
//		try {
//			lancaExcecao();
//		} catch (TesteException e) {
//			e.printStackTrace();
//		}
		
		//Se você extends com RuntimeException a função não precisa estar entre try-catch
		lancaExcecao();
		
	}
	
	public static void lancaExcecao() throws TesteException {
		if(1 == 1) {
			throw new TesteException("Exceção de teste");
		}
	}

}
