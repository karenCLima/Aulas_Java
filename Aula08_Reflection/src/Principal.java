import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Principal {

	public static void main(String[] args) {
		
		//Reflection
//		Class<?> clazz = Gerenciador.class;
//		System.out.println(clazz.getName());
//		System.out.println("--------------------------------------");
//		//Pega os Construtores
//		Constructor [] construtores = clazz.getConstructors();
//		for(Constructor construtor: construtores) {
//			System.out.println(construtor);
//		}
//		System.out.println("--------------------------------------");
//		//Só mostra os campos publicos
//		Field[] atributos = clazz.getFields();
//		for(Field atributo: atributos) {
//			System.out.println(atributo);
//		}
//		System.out.println("---------------------------------------");
//		//Pega todos os campos declarados (publicos e privados)
//		Field[] atributos2 = clazz.getDeclaredFields();
//		for(Field atributo: atributos2) {
//			System.out.println(atributo);
//		}
//		System.out.println("---------------------------------------");
//		//Pega os métodos e aqueles que extends da classe Object
//		Method[] metodos = clazz.getMethods();
//		for(Method metodo: metodos) {
//			System.out.println(metodo);
//		}
//		System.out.println("---------------------------------------");
//		//Pega apenas os métodos da classe 
//		Method[] metodos2 = clazz.getDeclaredMethods();
//		for(Method metodo: metodos2) {
//			System.out.println(metodo);
//		}	
		
		//Singleton
		Singleton singleton = Singleton.getInstance();
		Gerenciador gerenciador =new Gerenciador();
		
		singleton.setCampo1("Teste2");
		System.out.println(singleton.getCampo1());
		System.out.println(gerenciador.getCampo1());
		
		

	}

}
