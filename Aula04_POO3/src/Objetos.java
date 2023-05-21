
public class Objetos {
	private int valor1;
	private int valor2;
	
	//Construtor
	public Objetos(int val1, int val2) {
		this.valor1 = val1;
		this.valor2 = val2;
	}
	
	//toString
	@Override
	public String toString() {
		return "("+ this.valor1 + "," + this.valor2 + ")";
	}
	
	

}
