import java.util.Arrays;

public class Pedido {
	
	private Double valorTotal;
	private String [] itens = new String[10];
	Status status;
	
	public Pedido() {
		this.status = Status.AGUARDANDO;
		
	}
	
	public void AdicionandoItens(String item, double valor) {
		for(int i = 0; i<itens.length; i++) {
			if(itens[i] == null) {
				itens[i] = item;
				if(this.valorTotal == null) {
					this.valorTotal = valor;
				}else {
					this.valorTotal += valor;
				}
				break;
			}
		}
		
	}
	
	public void AlterarStatus(Status status) {
		this.status = status;
		
	}

	@Override
	public String toString() {
		return "Pedido \n valorTotal= R$" + this.valorTotal + "\n itens=" + itensParaString() + "]" + "\n status=" + this.status.toString();
	}
	
	public String itensParaString() {
		String resultado = "";
		
		for(int  i = 0; i<itens.length; i++) {
			if(itens[i] != null) {
				resultado += itens[i] + ", ";
			}
			
		}
		return resultado.substring(0, resultado.length() -2);
		
	}
	
	 

}
