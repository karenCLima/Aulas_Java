import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Digite um número:");
//		int valor1 = sc.nextInt();
//		
//		System.out.println("Digite outro número:");
//		int valor2 = sc.nextInt();
//		
//		System.out.println("A soma dos vallores é: " + (valor1 + valor2));
//		
//		if (valor1>valor2) {
//			System.out.println("O primeiro número digitado é maior que o segundo");
//		} else if(valor1<valor2) {
//			System.out.println("O segundo número digitado é maior que o primeiro");
//		}else {
//			System.out.println("Os valores são iguais");
//		}
//		
//		System.out.println("Digite um dia (numericamente):");
//		int dia = sc.nextInt();
//		
//		switch(dia)  {
//		case 1:
//			System.out.println("Domingo");
//			break;
//		case 2:
//			System.out.println("Segunda");
//			break;
//		case 3:
//			System.out.println("Terça");
//			break;
//		case 4:
//			System.out.println("Quarta");
//			break;
//		case 5:
//			System.out.println("Quinta");
//			break;
//		case 6:
//			System.out.println("Sexta");
//			break;
//		case 7:
//			System.out.println("Sábado");
//			break;
//		default:
//			System.out.println();
//		}
		
		//FOR 
		//WHILE
		//DO-WHILE
		
		
		int x = 0;
		for(x= 0; x<10; x++) {
			System.out.println(x);
		}
		while (x<10) {
			System.out.println(x);
			x++;
			
		}
		int k = 11;
		do {
			System.out.println(k+1);
			k++;
		}while(k<10);
		
		System.out.println("FIM");
		
		
		
		
	}
}
