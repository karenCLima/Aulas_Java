import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Adicionando Valores no Banco de Dados
		System.out.println("Digite o nome do usuario: ");
		String nome = sc.nextLine();
		System.out.println("Digite a senha do usuario: ");
		String senha = sc.nextLine();
		
		if(nome == null || senha == null) {
			System.out.println("ERRO");
			return;
		}
		Connection conexao = BancoDeDados.obterConexao();
		
		String sql = "INSERT INTO usuario (login, senha) values (?, ?)";
		try {
			PreparedStatement ps = conexao.prepareStatement(sql) ;
			ps.setString(1, nome);
			ps.setString(2, senha);
			int sucesso = ps.executeUpdate();
			if(sucesso>0) {
				System.out.println("Usuario inserido com sucesso!");
			}else {
				System.out.println("Não foi possível inserir o usuario.");
			}
		} catch (SQLException e) {
			System.out.println("Erro ao inserir usuario: " + e.getMessage());
		}
		System.out.println("============================================================");
		
		//Para consultar Valores dentro de um Banco de dados
		
		sql = "SELECT * FROM usuario";
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ResultSet resultado = ps.executeQuery();
			System.out.println("Consultando o banco de dados:");
			while(resultado.next()) {
				int id = resultado.getInt("id");
				String login = resultado.getString("login");
				String senhaR = resultado.getString("senha");
				System.out.println("ID: "+ id+ "- login: "+ login + "- senha: "+ senhaR);
			}
		} catch (SQLException e) {
			System.out.println("Erro ao consultar usuarios: " + e.getMessage());
		}
		System.out.println("============================================================");
		
		//Atualizar um valor no Banco de Dados
		System.out.println("Digite o id de um usuario para ser alterado: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o novo valor do campo: ");
		String novoValor = sc.nextLine();
		
		sql = "UPDATE usuario SET login = ? where id = ?";
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, novoValor);
			ps.setInt(2, id);
			int sucesso = ps.executeUpdate();
			if(sucesso>0) {
				System.out.println("Usuario alterado com sucesso!");
			}else {
				System.out.println("Não foi possível alterar o usuario.");
			}
			
		} catch (SQLException e) {
			System.out.println("Erro ao atualizar usuario: " + e.getMessage());
		}
		System.out.println("============================================================");
		
		//Excluindo valores do Banco de dados
		System.out.println("Digite o id de um usuario para se excluído: ");
		id =sc.nextInt();
		
		sql ="DELETE from usuario WHERE id = ?";
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, id);
			int sucesso = ps.executeUpdate();
			if(sucesso>0) {
				System.out.println("Usuario excluído com sucesso!");
			}else {
				System.out.println("Não foi possível excluir o usuario.");
			}
			
		} catch (SQLException e) {
			System.out.println("Erro ao excluir o usuario: " + e.getMessage());
		}
		System.out.println("============================================================");
		
		//Mostrando novamente a lista de Usuarios
		sql = "SELECT * FROM usuario";
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ResultSet resultado = ps.executeQuery();
			System.out.println("Consultando o banco de dados:");
			while(resultado.next()) {
				id = resultado.getInt("id");
				String login = resultado.getString("login");
				String senhaR = resultado.getString("senha");
				System.out.println("ID: "+ id+ "- login: "+ login + "- senha: "+ senhaR);
			}
		} catch (SQLException e) {
			System.out.println("Erro ao consultar usuarios: " + e.getMessage());
		}
		
		BancoDeDados.fecharConexao();

	}

}
