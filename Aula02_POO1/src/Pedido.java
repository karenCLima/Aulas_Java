
public class Pedido {
	
	//ATRIBUTOS
	String cliente;
	String produtos;
	int quantidade;
	double valor;
	
	//CONSTRUTOR
	public Pedido(String cliente) {
		this.cliente = cliente;
	}
	

	//MÉTODOS
	public void inserirProduto (String produto,double valor) {
		if(this.produtos == null) {
			this.produtos = produto;
		}else {
			this.produtos += ", " + produto;
		}
		
		this.valor += valor;
		this.quantidade++;
	}
	
	//SOBRECARGA
	public void inserirProduto(String produto, double valor, int quantidade) {
		for(int i = 0; i<quantidade; i++) {
			this.inserirProduto(produto, valor);
		}
	}
	
	public String detalhesDoPedido() {
		return "Cliente: " + this.cliente + "\n"+
				"Pordutos: " + this.produtos + "\n"+
				"Quantidade: " + this.quantidade+ "\n"+
				"Valor: R$" + this.valor;
		
	}
	
	//IMPLEMENTANDO EQUALS
	public boolean equals(Pedido outro) {
		return this.cliente.equals(outro.cliente) && this.produtos.equals(outro.produtos)
				&& this.quantidade == outro.quantidade && this.valor == outro.valor;
	}
}
