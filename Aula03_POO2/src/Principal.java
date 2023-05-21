
public class Principal {

	public static void main(String[] args) {
		
		
		Cliente cliente = new Cliente ("Beltrano", "123.458.789-21", "Rua 1");
		
		ContaBancaria conta = new ContaBancaria(cliente, TipoConta.CONTA_CORRENTE, 1000, 2500);
		
		System.out.println(conta);
		
		
//		conta.setCliente("Fulano");
		
		// Antes do Static 
//		Impressora impressora = new Impressora();		
//		impressora.imprimiString("teste"); 
		// Observe que preciso instanciar e chamar o objeto para usar.
		
		//Depois de Adicionar Static
//		 Impressora.imprimiString("Teste2");
//		 Impressora.imprimiString(Impressora.marca);
		//Observe que eu não preciso instanciar (chamar) a classe antes de usar e nem usar um objeto.
		//Pode ser Alterado:
//		 Impressora.marca = "Samsung";
//		 Impressora.imprimiString(Impressora.marca);
		 
		 //Final com Static- Posso chamar o valor fora da classe dele, mas não pode ser alterado
		 //Impressora.imprimiString(Impressora.PI);
		


	}

}
