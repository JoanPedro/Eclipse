package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {
	
	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		String SQL = "SELECT * FROM pessoas WHERE nome LIKE ?";

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o nome: ");
		String outNome = entrada.nextLine();
		
		PreparedStatement stmt = conexao.prepareStatement(SQL);
		stmt.setString(1, "%" + outNome + "%");
		
		ResultSet resultado = stmt.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		pessoas.stream().forEach(pessoa -> System.out.println(pessoa.getCodigo() + " ==> " + pessoa.getNome()));
		
		entrada.close();
		stmt.close();
		conexao.close();
	}
}
