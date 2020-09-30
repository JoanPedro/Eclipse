package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
	public static void main(String[] args) throws SQLException {
		
		final String url = "jdbc:sqlserver://localhost:1433";
		final String user = "sa";
		final String password = "yourStrong(!)Password";
		
		Connection conexao = DriverManager.getConnection(url, user, password);
		
		System.out.println("Conexão efetuada com sucesso!");
		
		Statement stmt = conexao.createStatement();
		stmt.execute("IF NOT EXISTS (\n" + 
				"    SELECT [name]\n" + 
				"        FROM sys.databases\n" + 
				"        WHERE [name] = 'curso_java'\n" + 
				")\n" + 
				"CREATE DATABASE curso_java");
		
		conexao.close();
	}
}
