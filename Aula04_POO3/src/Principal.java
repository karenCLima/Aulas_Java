import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
//		// Criando um Array
//		int [] arrayInt = new int [3];// aqui vc decide quantas posições vai ter o array
//		arrayInt[0] = 10;
//		arrayInt[1] = 20;
//		arrayInt[2] = 30;
//		
//		//Para exibir o array tem que passar por cada um dos dados. Ele não mostra o array inteiro 
//		for(int i = 0; i < arrayInt.length; i++) {
//			System.out.println(arrayInt[i]);
//		}
//		System.out.println("------------------------------");
//		
//		//Outra forma de percorrer o Array: Para cada elemento do array, mostre o elemento.
//		for(int elemento: arrayInt) {
//			System.out.println(elemento);
//		}
		
		//Desafio da Aula no sistema de ensino- Fazer um array com objetos e percorrer o array
		
//		Objetos obj1 = new Objetos(10,20);
//		System.out.println(obj1);
//		
//		Objetos[] arrayObjetos = new Objetos[4];
//		arrayObjetos[0] = new Objetos(10,20);
//		arrayObjetos[1] = new Objetos(30,40);
//		arrayObjetos[2] = new Objetos(50,60);
//		arrayObjetos[3] = new Objetos(100,200);
//		
//		for(Objetos obj: arrayObjetos) {
//			System.out.println(obj);
//		}
		
//		
//		System.out.println("--------------------------------------------------");
//		
//		//Listas -ArrayList
//		ArrayList <Integer> listaInt = new ArrayList<>();
//		
//		
//		listaInt.add(10);
//		listaInt.add(20);
//		listaInt.add(30);
//		listaInt.add(40);
//		listaInt.add(50);
//		
//		listaInt.remove(0);
//		listaInt.remove(new Integer(20));
//		
//		System.out.println(listaInt);
//		
//		for(int i = 0; i < listaInt.size();i++) {
//			System.out.println(listaInt.get(i));
//		}
//		
//		//mesma coisa que o de cima. Para cada inteiro da Lista, mostre o inteiro.
//		for (Integer inteiro: listaInt) {
//			System.out.println(inteiro);
//		}
//		
//		ArrayList <String> listaStr = new ArrayList<>();
//		
//		listaStr.add("maça");
//		listaStr.add("banana");
//		listaStr.add("laranja");
//		listaStr.add("abacaxi");
//		listaStr.add("uva");
//		
//		System.out.println(listaStr);
//		
//		ArrayList <String> listaStr2 = new ArrayList<>();
		
		
		//Herança
		
//		ContaBancaria contaBancariaNormal = new ContaBancaria("Fulano", 2500);
//		System.out.println(contaBancariaNormal);
//		
//		ContaBancariaPJ contaBancariaPJ = new ContaBancariaPJ("Beltrano", 10000, "EuCurso");
//		System.out.println(contaBancariaPJ);
//		
//		//Polimorfismo
//		ContaBancaria contaBancaria = new ContaBancariaPJ("Ciclano", 15000, "EuCurso");
//		//Obs: vc só tem acesso aos métodos da conta Bancaria Normal e não aos métodos da ContaBancariaPJ
//		//Não poderia usar os getters e setters para pegar informações da empresa.
//		System.out.println(contaBancaria);
		
		//Classes Abstratas
		ContaBancaria contaBancaria = new ContaBancariaPJ("Ciclano", 15000, "EuCurso");
		ContaBancaria contaBancaria2 = new ContaBancariaPF("Fulano", 12000);
		
		System.out.println(contaBancaria);
		System.out.println(contaBancaria2);
		System.out.println("____________________________________");
		
		//Métodos Abstratos
		 contaBancaria.mostrarSaldo();
		 contaBancaria2.mostrarSaldo();
		 System.out.println("____________________________________");
		 
		 contaBancaria.Sacar(14980);
		 contaBancaria2.Sacar(12000);
		
		
		 
	}

}
