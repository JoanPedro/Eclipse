package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
	public static void main(String[] args) throws SQLException {
		
		Connection conexao = FabricaConexao.getConexao();
		
		Statement stmt = conexao.createStatement();
		stmt.execute("IF NOT EXISTS (" + 
				"		SELECT * FROM sysobjects WHERE NAME='pessoas' and xtype='U'" + 
				")	CREATE TABLE pessoas (" + 
				"		codigo INT NOT NULL IDENTITY(1,1) PRIMARY KEY," + 
				"       nome VARCHAR(80) NOT NULL" + 
				");");
		
		System.out.println("Tabela criada com sucesso");
		conexao.close();
	}
}
