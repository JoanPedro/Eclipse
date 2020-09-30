package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	public static void main(String[] args) throws SQLException {
		
		final String url = "jdbc:sqlserver://localhost:1433";
		final String user = "sa";
		final String password = "yourStrong(!)Password";
		
		Connection conexao = DriverManager.getConnection(url, user, password);
		
		System.out.println("Conexão efetuada com sucesso!");
		conexao.close();
	}
}
