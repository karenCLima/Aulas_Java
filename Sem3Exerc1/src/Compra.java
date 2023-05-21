import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Compra {
	
	//Atributos
	private String descricao;
	private LocalDate dataCompra;
	
	//Construtor
	public Compra(String descricao, LocalDate dataCompra) {
		this.descricao = descricao;
		this.dataCompra = dataCompra;
	}
	
	//Métodos
	@Override
	public String toString() {
		return "Compra [descricao=" + descricao + ", dataCompra=" + dataCompra.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "]";
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(LocalDate dataCompra) {
		this.dataCompra = dataCompra;
	}
	
	
	

}
