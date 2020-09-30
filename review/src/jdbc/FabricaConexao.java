package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
	public static Connection getConexao() {
		try {
			final String url = "jdbc:sqlserver://localhost:1433;databaseName=curso_java;verifyServerCertificate=true";
			final String user = "sa";
			final String password = "yourStrong(!)Password";
			
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
