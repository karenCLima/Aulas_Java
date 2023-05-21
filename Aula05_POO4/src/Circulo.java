
public class Circulo implements Forma {
	
	private double circunferencia;
	
	//Construtor
	public Circulo(double circunferencia) {
		this.circunferencia = circunferencia;
	}

	@Override
	public double calculaArea() {
		double raio = this.circunferencia / (2*Math.PI) ;
		double area = Math.PI*raio*raio;
		return area;
	}

	

}
