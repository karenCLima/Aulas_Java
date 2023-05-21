
public class Impressora {

	public static String marca = "HP";
	
	//Um final precisa estar todo em maiusculo
	//Não pode acessar fora da classe
//	public final double PI = 3.1415;
	
	//Dessa forma posso acessar fora da classe
	public static final double PI = 3.1415;
	
	public static void imprimiString(String string) {
		System.out.println(string);
	}
}
