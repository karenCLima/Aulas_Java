import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		Pedido pedido01 = new Pedido("Fulano");
		pedido01.inserirProduto("Meia",15);
		pedido01.inserirProduto("Calça", 80,2);
		pedido01.inserirProduto("Tenis", 250);
		
		System.out.println(pedido01.detalhesDoPedido());
		System.out.println();
		
		Pedido pedido02 = new Pedido("Fulano");
		pedido02.inserirProduto("Meia", 20,5);
		pedido02.inserirProduto("Calça", 80);
		pedido02.inserirProduto("Tenis", 250);
		
		System.out.println(pedido02.detalhesDoPedido());
		System.out.println();

		//IMPLEMENTANDO EQUALS
//		String nome = "Fulano";
//		
//		if(nome.equals(pedido01.cliente)) {
//			System.out.println("É igual");
//		}else {
//			System.out.println("Não é igual");
//		}
		
//		
//		if(pedido01.equals(pedido02)) {
//			System.out.println("É igual");
//		}else {
//			System.out.println("Não é igual");
//		}
		

	}

}
