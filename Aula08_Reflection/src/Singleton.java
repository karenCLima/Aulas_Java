
public class Singleton {
	
	private static Singleton singleton;
	private String campo1;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(singleton ==null) {
			singleton = new Singleton();
		}
		return singleton;
	}

	public String getCampo1() {
		return campo1;
	}

	public void setCampo1(String campo1) {
		this.campo1 = campo1;
	}
	
	
}
