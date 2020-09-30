package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
	public static void main(String[] args) throws SQLException {
		
		Connection conexao = FabricaConexao.getConexao();
		
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
