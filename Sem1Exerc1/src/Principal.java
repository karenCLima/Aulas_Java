import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;


public class Principal {
	
// Exercício 1	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int [] valores = new int[3];
//		int valor = 0;
//		while (valor < 3) {
//			System.out.println("Digite um valor:");
//			valores[valor]= sc.nextInt();
//			valor++;
//		}
//		int maior = valores [0];
//		for (int i = 0; i <valores.length; i++) {
//			if (valores[i]>= maior) {
//				 maior = valores [i];
//		}
//		}
//		System.out.println("O maior valor é : " + maior);
//		int menor = valores [0];
//		for (int i = 0; i <valores.length; i++) {
//			if (valores[i]<= menor) {
//				menor = valores [i];
//		}
//		}
//		System.out.println("O menor valor é : " + menor);
//		sc.close();
//		
//	}

//Exercício 2
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Quantas maçãs deseja comprar?:");
//		int quantidade = sc.nextInt();
//		double valor = 0.0;
//		if (quantidade < 12) {
//			valor = (quantidade * 0.30);
//		}else {
//			valor = (quantidade*0.12);
//		}
//		BigDecimal bd = new BigDecimal(valor).setScale(2, RoundingMode.HALF_EVEN);
//		System.out.println("O valor da compra é: R$ " + bd);
	//
	// ou poderia ter feito OPERAÇÃO TERNÁRIA
	// double total = quantidade >11? quantidade*0.25 : quantidade*0.3;
	//System.out.println("O valor da compra é: R$ " + total);
	//
//		sc.close();
//	}

//Exercício 3
//	public static void CalculoValorLiquido(double salario) {
//	double [] salarios = {1000.00,2500.00,4800.00,100000000000000.00};
//	double [] desconto = {0.06, 0.08,0.10, 0.15 };
//	int i = 0;
//	while (salario>salarios[i]) {
//		i++;
//	}
//	double valorLiquido = salario -(salario * desconto[i]);
//	System.out.println("O valor líquido é: R$" + valorLiquido);
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Escreva seu salário bruto: ");
//		double salario = sc.nextDouble();
//		CalculoValorLiquido(salario);
//	}
		
}

