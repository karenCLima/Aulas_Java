import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoDeDados {
	
	private static Connection conexao;
	private static final String URL = "jdbc:mysql://localhost:3306/aula12";
	private static final String USUARIO = "root";
	private static final String SENHA= "";
	
	
	//Conectando com o Banco de dados
	
	public static Connection obterConexao() {
		try {
			if(conexao == null || conexao.isClosed()) {
				conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
			}
			return conexao;
		} catch (SQLException e) {
			System.out.println("Erro ao obter conexão" + e.getMessage());
		}
		return null;
	}
	
	//Fechando Conexão com o Banco de dados
	
	public static void fecharConexao() {
		try {
			if(conexao != null & !conexao.isClosed()) {
				conexao.close();
				conexao = null;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao fechar conexão" + e.getMessage());
		}
	}

}
