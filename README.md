# Códigos com minhas aulas de Java
#### Minhas Aulas de Java do Projeto da +PraTi com a EuCurso. 
##### A seguir tem o detalhamento do conteúdo de cada pasta:
* Aula01: Tipos primitivos, Tipos Wrappers, Diferença entre uma 
variável vaiza e uma nula.
* Aula02:Programação Orientada  a objetos: O que é POO, Objeto, 
Classe, Métodos,Diferença entre variáveis e objetos, Construtor,
A palavra this, Sobrecarga.
* Aula03:Programação Orientada  a objetos:Encapsulamento, modificdores
de acesso (Public, Private, static e final), enumerações, associação,
Agregação, Composição.
* Aula04:Programação Orientada  a objetos: Listas, Interface List,
Diferença entre ArrayList e LinkedList, Herança, Super, sobreposição,
override, Polimorfismo, Classes Abstratas, Métodos Abstratos. 
* Aula05:Programação Orientada  a objetos: Interfaces, implementação
de Interfaces, Tratamento de Exceções, Estrutura Try-Catch-Finally,
Classe Exception, Classe RunTimeException.
* Aula06: Interface List, LinkedList, ArrayList, Inteface Set, 
HashSet, TreeSet, Interface Map, HashMap, TreeMap, Expressões
Lambda, Interface funcional, Predicate, Consumer,Function, Streams,
Date, LocalDate, LocalDateTime e DateTimeFormatter.
* Aula07: Não est´presente pois foi aprendido conceitos de Git e Github.
* Aula08:Generics, Generics em Classe, Generics em Método, Tipo 
Coringa (wildcard), Reflection, Singleton, Arquitetura de Projetos
em Camadas: Camada Model, Camada Service, Camada Repository, Camada
Utils.
* Aula09 e 10: Servidor local, Introdução a Banco de dados, Instalação do XAMPP, 
manipulação do banco de dados MySQL/MariaDB, Linguagem SQL.
* Aula 11 e 12: Conexão Java com banco de dados MySQL, Importar Jar, JDBC, PreparedStatement, executeUpdate, executeQuery
* Sem1Exerc2:
  * Criar uma classe Jogador que tenha as propriedades nome, gols, 
  assistências.
  E os métodos adicionarGol e adicionarAssistencia que receba como
  argumento as quantidade de gols/assistências.
  Também criar dois métodos para ver o número de gols e assistências
  * Criar uma classe aluno que receba um nome, nota1, nota2 e nota3, 
  onde o montante das notas podem chegar no máximo 100.
  Cria um método que retorne o nome do aluno, sua média, a maior e
  menor nota. 

* Sem2Exer1:
  * Crie uma classe Aluno com os campos nome, matrícula e notas[3].
  Essa classe deve ser encapsulada e no momento de adicionar uma 
  nova nota, ela deve verificar se o somatório será maior que 100,
  caso for. Deixe uma mensagem que não foi possível e peça para 
  adicionar novamente uma nota.
  * Crie uma classe Pedido com os campos Itens[10], status e 
  valorTotal.Essa classe deverá ter os métodos para adicionar itens, 
  que receberá como parâmetro o item e o valor.
  Também deverá ter um método para alterar o status do pedido.
  * Crie uma classe Calculadora com os métodos das operações 
  matemáticas estáticos.
  Soma, Subtração, Multiplicação e Divisão.
  Use essa classe sem instanciar ela.

* Sem2Exerc2:
  * Cria uma classe do tipo Funcionario, com os campos: nome, função
  e cargo.Crie uma lista e adicione 10 objetos do tipo Funcionario 
  dentro dela.
  Depois exiba no console todas informações de cada objeto
  * Crie uma classe Animal, depois crie classes filhas a partir desta 
  classe.
  Exemplo: humanos, macacos, tigres…
  A classe Animal deve ter um método e as classes filhas devem 
  sobrescrever esse método.
  * Crie uma classe abstrata Funcionário que tenha os campos: 
  nome, valorHora, totalHoras.Esta classe também deve ter o método 
  abstrato para retornar o valor total a receber.
  Depois crie algumas classes que estendem a classe Funcionario
  Todas classes filhas devem ter um campo constante com o valor de 
  bonificação e a partir deste campo, fazer o cálculo do total a 
  receber.
  programador 5% (0.05), contador 3% (0.03), administrador 6% (0.06).

* Sem3Exerc1:
  * Nós temos uma lista com várias frutas: Maçã, Laranja, Limão, 
  Pêra, Abacate,Morango, Ameixa, Manga, Maracujá.
  Utilizando stream, crie uma nova lista sem as frutas que começam 
  com a letra "M"
  * Crie um sistema utilizando do-while que insira alunos em um Map.
  A chave (Key) deverá ser a matrícula do aluno e o valor (Value) 
  deverá ser o próprio objeto Aluno.
  Depois crie uma funcionalidade para remover alunos deste Map 
  através da chave.
  * Crie uma classe Compra com os campos "descricao" e "dataCompra".
  Depois crie um sistema com algum laço de repetição que tenha três
  opções:
    * Inserir uma nova compra
    * Ver compras em algum dia específico.
    * Sair do sistema e finalizar.

* Sem4Exerc1
  * 
  1. Crie a classe Produto com os atributos id (int) e nome 
  (String).
  2. Crie a classe GerenciadorRepository que seja um Singleton 
  e tenha métodos para adicionar, buscar e remover produtos.
  3. Utilize Generics para permitir o gerenciamento de produtos de 
  qualquer tipo.
  4. Na classe principal você cria instâncias do GerenciadorProduto,
  adiciona, busca e remove produtos, demonstrando o funcionamento 
  do sistema.


