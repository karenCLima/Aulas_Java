
public class Gerenciador {
	private String campo1;
	public Integer campo2;
	
	public Gerenciador() {
		
	}
	
	public Gerenciador(String campo1, Integer campo2) {
		this.campo1 = campo1;
		this.campo2 = campo2;
	}

	public String getCampo1() {
		Singleton singleton = Singleton.getInstance();
		return singleton.getCampo1();
	}

	public void setCampo1(String campo1) {
		this.campo1 = campo1;
	}
	
	
}
