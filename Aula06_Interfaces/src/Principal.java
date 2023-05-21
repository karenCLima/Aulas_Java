import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {

	public static void main(String[] args) {
		
		//Interface List e Set
//		List <String> frutas = new ArrayList<>();
//		List <String> legumes = new LinkedList<>();
//		Set <String> frutasSet = new HashSet<>();
//		Set <String> legumesSet = new TreeSet<>();
//		
//		frutas.add("laranja");
//		frutas.add("morango");
//		frutas.add("limão");
//		frutas.add("abacaxi");
//		frutas.addAll(Arrays.asList("maça","abacate","amora"));
//		
//		legumes.add("Brócolis");
//		legumes.add("alface");
//		legumes.add("cebola");
//		legumes.add("Beterraba");
//		
//		//Set não aceita valores duplicados e não é ordenado
//		frutasSet.add("laranja");
//		frutasSet.add("morango");
//		frutasSet.add("limão");
//		frutasSet.add("abacaxi");
//		frutasSet.add(null); //Aceita null
//		
//		legumesSet.add("brócolis");
//		legumesSet.add("alface");
//		legumesSet.add("cebola");
//		legumesSet.add("Beterraba");
//		legumesSet.add("beterraba");//É case sensitive
//		
//		
//		System.out.println("ArrayList: " + frutas);
//		System.out.println("LinkedList: " + legumes);
//		System.out.println("HashSet: " + frutasSet);
//		System.out.println("TreeSet: " + legumesSet);
		
		//Interface Map- o dicionario do Java
//		Map<Integer, String> mapaUsuarios = new HashMap<>();
//		Map<Integer, String> mapaUsuarios2 = new TreeMap<>();
//		
//		
//		mapaUsuarios.put(1, "Fulano");
//		mapaUsuarios.put(2, "Beltrano");
//		mapaUsuarios.put(5, "Ciclano");
//		mapaUsuarios.put(3, "Maria");
//		mapaUsuarios.put(null, "Ana"); //HashMap aceita null
//		
//		mapaUsuarios2.put(1, "Fulano");
//		mapaUsuarios2.put(2, "Beltrano");
//		mapaUsuarios2.put(5, "Ciclano");
//		mapaUsuarios2.put(3, "Maria");
//		mapaUsuarios2.remove(5);
		

//		System.out.println("HashMap: " + mapaUsuarios);
//		System.out.println("TreeMap: " + mapaUsuarios2);
//		
//		List <String> nomes = new ArrayList<>(mapaUsuarios.values());
//		System.out.println("Lista com os valores do Map: " + nomes);
//		
//		Set <Integer> chaves = new HashSet<>(mapaUsuarios.keySet());
//		System.out.println("Set com as chaves do Map: " + chaves);
//		
		//Expressões Lambdas
//		List <String> frutas = new ArrayList<>();
//
//		frutas.add("laranja");
//		frutas.add("morango");
//		frutas.add("limão");
//		frutas.add("abacaxi");
//		frutas.add("pera");
//		
//		//CONSUMER
//		//Primeira forma
//		Consumer <String> imprimirNome = nome -> System.out.println(nome);
//		frutas.forEach(imprimirNome);
//		//Segunda forma
//		frutas.forEach(nome -> System.out.println(nome));
//		System.out.println("___________________________________");
		
		//PREDICATE
		//Primeira forma
//		Predicate <String> iniciaComL = nome -> nome.startsWith("l");
//		frutas.removeIf(iniciaComL);
//		frutas.forEach(nome -> System.out.println(nome));
		//Segunda forma
//		frutas.removeIf(nome -> !nome.startsWith("l")); //se não inicia com 'l'
//		frutas.forEach(nome -> System.out.println(nome));
		
		//STREAMS e FUNCTION
//		Stream <String> frutasStream = frutas.stream();
//		
//		//Primeira forma: Function and map
//		Function <String, Character> stringParaCaracter = nome -> nome.charAt(0);
//		Stream <Character> caracterStream = frutasStream.map(stringParaCaracter);
//		List <Character> caracterList = caracterStream.collect(Collectors.toList());
//		System.out.println("Caracter Lista: " + caracterList);
//		
//		//Segunda forma
//		List <Character> caracterList2 = frutas.stream().map(nome -> nome.charAt(0)).collect(Collectors.toList());
//		System.out.println("Caracter Lista2: " + caracterList2);
		
		
		//Datas
		
		//Antigamente
		Date dataAtual0 = new Date();
		System.out.println(dataAtual0);
		
		//Agora
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //MM=meses e mm=minutos
		Date dataAtual = new Date();
		System.out.println(sdf.format(dataAtual));
		//Para adicionar hora
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //hh=padrao 12h HH=padrao 24h
		Date dataAtual1 = new Date();
		System.out.println(sdf1.format(dataAtual1));
		
		//LocalDate
		LocalDate dataAtualLD = LocalDate.now();
		System.out.println(dataAtualLD);
		//Formatando LocalDate com DateTimeFormatter
		//Primeira forma
		DateTimeFormatter formatLD = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataAtualLD0 = LocalDate.now();
		System.out.println(dataAtualLD0.format(formatLD));
		//Segunda forma
		LocalDate dataAtualLD1 = LocalDate.now();
		System.out.println(dataAtualLD1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		//LocalDateTime -Para trabalhar com horas
		LocalDateTime dataAtualLD2 =LocalDateTime.now();
		System.out.println(dataAtualLD2);
		//LocalDateTime com formatação
		LocalDateTime dataAtualLD3 =LocalDateTime.now();
		System.out.println(dataAtualLD3.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
		
		Scanner sc = new Scanner(System.in);
		String dataCompra1 = sc.nextLine();
		LocalDate dataCompra = LocalDate.parse(dataCompra1,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(dataCompra.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
