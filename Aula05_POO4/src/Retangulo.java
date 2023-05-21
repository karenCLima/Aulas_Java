
public class Retangulo implements Forma {
	
	private double altura;
	private double largura;
	
	//Construtor
	public Retangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}



	@Override
	public double calculaArea() {
		return altura*largura;
	}

}
